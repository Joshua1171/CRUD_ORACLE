package com.indra.bbva.oracle.hr.controllers;

import com.indra.bbva.oracle.hr.dao.IUsersDao;
import com.indra.bbva.oracle.hr.entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
public class UsuariosController {

    @Autowired
    private IUsersDao usersDao;

    @GetMapping("/usuarios")
    public List<Usuario> index(HttpServletRequest request){
        return (List<Usuario>) usersDao.findAll();
    }

    @GetMapping("/usuarios/{email}/password/{password}")
    public ResponseEntity<?> validar(@PathVariable String email,@PathVariable String password){
        Usuario user;
        Map<String,Object> response=new HashMap<>();

        try{
            user=usersDao.findByEmailAndPassword(email,password);
        }catch (DataAccessException e){
            response.put("mensaje","Error al hacer la consulta en la base de datos");
            response.put("error",e.getMessage().concat(":").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<Map<String,Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        if (user==null){
            response.put("mensaje","Correo del cliente:".concat(email.concat("no existe en la base de datos")));
            return new ResponseEntity<Map<String,Object>>(response,HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Usuario>(user,HttpStatus.OK);
    }
    @PostMapping("/usuarios")
    public ResponseEntity<?> crear(@Valid @RequestBody Usuario usuario, BindingResult result){
        Usuario u =null;

        Map<String,Object> response = new HashMap<>();
        if (result.hasErrors()){

            /*
            *  List<String> errors = new ArrayList<>();
            for(FieldError err: result.getFieldErrors()) {
                errors.add("El campo '" + err.getField() +"' "+ err.getDefaultMessage());
            }
            * */
            List<String> errors=result.getFieldErrors()
                    .stream()
                    .map(err -> "El campo"+err.getField()+""+err.getDefaultMessage())
                    .collect(Collectors.toList());
            response.put("errors",errors);
            new ResponseEntity<Map<String,Object>>(response,HttpStatus.BAD_REQUEST);
        }
        try{
            u=usersDao.save(usuario);
        }catch (DataAccessException e){
            response.put("mensaje","No se pudo insertar en la base de datos");
            response.put("error",e.getMessage().concat(":").concat(e.getMostSpecificCause().getMessage()));
            new ResponseEntity<Map<String,Object>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
        }
        response.put("mensaje","El usuario fue creado satisfactoriamente");
        response.put("usuario",u);
        return new ResponseEntity<Map<String,Object>>(response,HttpStatus.CREATED);
    }

}

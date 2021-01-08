package com.indra.bbva.oracle.hr.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name="usuarios")
public class Usuario implements Serializable {
    private static final long serialVersionUID = -7421905690934349349L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usrSeq")
    @SequenceGenerator(name = "usrSeq", sequenceName = "sec_users", allocationSize = 1)
    private Long id_usuarios;
    @Email
    @Column(unique = true)
    @NotNull(message = "el correo no puede ir vacio")
    private String email;

    @Size(min = 6,max=8)
    @NotNull(message = "la contraseña no puede ir vacia")
    private String password;

}

package com.indra.bbva.oracle.hr.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "aspirantes")
public class Aspirantes implements Serializable {
    private static final long serialVersionUID = -2980054472213453004L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "aspSeq")
    @SequenceGenerator(name = "aspSeq", sequenceName = "sec_aspirante ", allocationSize = 1)
    private Long id_aspirante;

    private String nombres;
    private String apellidos;
    private int experiencia=0;
    private String descripcion;
    private String tecnologia;
    private int estatus=0;
    private int proceso=0;

    public Long getId_aspirante() {
        return id_aspirante;
    }

    public void setId_aspirante(Long id_aspirante) {
        this.id_aspirante = id_aspirante;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    public int getProceso() {
        return proceso;
    }

    public void setProceso(int proceso) {
        this.proceso = proceso;
    }
}

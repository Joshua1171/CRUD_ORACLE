package com.indra.bbva.oracle.hr.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;


@Getter
@Setter
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




}

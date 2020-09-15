/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinfloo.ejemplo01;

import javax.persistence.*;


/**
 *
 * @author mipc
 */

@Entity
@Table(name = "ciudad" )
public class Ciudad {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idciudad;
    @Column
    private String nombre;
    @Column
    private String descripcion;

    public int getIdciudad() {
        return idciudad;
    }

    public void setIdCiudad(int idciudad) {
        this.idciudad = idciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}

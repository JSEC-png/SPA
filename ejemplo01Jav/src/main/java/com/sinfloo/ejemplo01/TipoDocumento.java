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
@Table(name = "tipodocumento" )
public class TipoDocumento {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idtipodocumento;
    @Column
    private String nombre;
    @Column
    private String descripcion;

    public int getIdtipodocumento() {
        return idtipodocumento;
    }

    public void setIdtipodocumento(int idTipoDocumento) {
        this.idtipodocumento = idTipoDocumento;
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinfloo.ejemplo01;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author USUARIO
 */
@Service
public class PersonaServiceImp implements PersonaService{

    @Autowired
    private PersonaRepositorio repositorio;
    
    
    
    @Override
    public List<Persona> listar() {
        return repositorio.findAll(); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    @Override
    public Persona listarId(int id) {
        return repositorio.findById(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Persona add(Persona p) {
        return repositorio.save(p); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Persona edit(Persona p) {
        return repositorio.save(p);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Persona delete(int id) {
        Persona p = repositorio.findById(id);
        if(p!=null)
        {
            repositorio.delete(p);
        }
        
        return p; //To change body of generated methods, choose Tools | Templates.
    }
    
}

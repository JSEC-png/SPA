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
 * @author mipc
 */
@Service
public class TipoDocumentoServiceImp implements TipoDocumentoService{
    @Autowired
    private TipoDocumentoRepositorio repositorio;
    
    @Override
    public List<TipoDocumento> listarTi() {
        return repositorio.findAll(); //To change body of generated methods, choose Tools | Templates.
    }
}

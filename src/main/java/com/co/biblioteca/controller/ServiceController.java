/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.biblioteca.controller;


import com.co.biblioteca.inteface.AutorRepository;
import com.co.biblioteca.inteface.CopiaRepository;
import com.co.biblioteca.inteface.LectorRepository;
import com.co.biblioteca.inteface.LibroRepository;
import com.co.biblioteca.inteface.PrestamoRepository;
import com.co.biblioteca.models.Lector;
import com.co.biblioteca.models.Prestamo;
import com.co.biblioteca.models.PrestamoLibro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author mayer
 */
@RestController
public class ServiceController {
    
  
     @Autowired
     LibroRepository libroRepository;
     @Autowired
     AutorRepository autorRepository;
     @Autowired
     CopiaRepository copiaRepository;
     @Autowired
     LectorRepository lectorRepository;
     @Autowired
     PrestamoRepository prestamoRepository;
     
    @GetMapping
    public String home(){
        return "Hola mundo";
    }
   
    @RequestMapping(method=RequestMethod.POST, value="/prestamo")
    public String saveLibro(@RequestBody PrestamoLibro prestamoLibro) {
        
        Lector lector = lectorRepository.save(prestamoLibro.getLector());
        Prestamo  prestamo = prestamoRepository.save(prestamoLibro.getPrestamo());
                
        if (lector != null && prestamo != null){
            return "Proceso Exitoso";
        }else {
            return "Proceso Fallido";
        }
    }
    
    
    
}

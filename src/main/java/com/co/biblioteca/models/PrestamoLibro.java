/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.biblioteca.models;

/**
 *
 * @author mayer
 */
public class PrestamoLibro {
    private Lector lector;
    private Prestamo prestamo;

    
      
    public PrestamoLibro() {
        
    }

    public PrestamoLibro(Lector lector, Prestamo prestamo){
        this.lector = lector;
        this.prestamo = prestamo;
    }
    /**
     * @return the lector
     */
    public Lector getLector() {
        return lector;
    }

    /**
     * @param lector the lector to set
     */
    public void setLector(Lector lector) {
        this.lector = lector;
    }

    /**
     * @return the prestamo
     */
    public Prestamo getPrestamo() {
        return prestamo;
    }

    /**
     * @param prestamo the prestamo to set
     */
    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }
    
    
    
}

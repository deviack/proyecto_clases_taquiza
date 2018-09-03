/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.taquiza.clases;

import com.taquiza.abstracta.Alimento;

/**
 *
 * @author Kala
 */
public class Taco extends Alimento {
       // super (está heredando de la súper clase alimento)
        private String nombre;
        private int precio;
        private boolean verduras;
        private boolean salsa;
     
        
         public Taco() {
    }

    public Taco(String sabor, String nombre, int precio, boolean verduras, boolean salsa) {
        super (sabor);
        this.nombre = nombre;
        this.precio = precio;
        this.verduras = verduras;
        this.salsa = salsa;
       
   
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * @return the verduras
     */
    public boolean isVerduras() {
        return verduras;
    }

    /**
     * @param verduras the verduras to set
     */
    public void setVerduras(boolean verduras) {
        this.verduras = verduras;
    }

    /**
     * @return the salsa
     */
    public boolean isSalsa() {
        return salsa;
    }

    /**
     * @param salsa the salsa to set
     */
    public void setSalsa(boolean salsa) {
        this.salsa = salsa;
    }
    
   

    @Override
    public void engordar() {
    System.out.println("Ja, ya engordaste :3");
    
    }
    //CREAMOS DOS TAQUITOS
    Taco taco1 = new Taco("con mucho sabor","bistek", 12, true, true);
    Taco taco2 = new Taco("con mucho sabor","pastor", 15, true, false);
    
}

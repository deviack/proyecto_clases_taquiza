/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.taquiza.abstracta;

/**
 *
 * @author Kala
 */
public abstract class Alimento {
    private String sabor;
    

    public Alimento() {//constructor sin parámetros
    }

    public Alimento(String sabor) {//constructor con parámetros
        this.sabor = sabor;
    }
    

    /**
     * @return the sabor
     */
    public String getSabor() {
        return sabor;
    }

    /**
     * @param sabor the sabor to set
     */
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    
    public abstract void engordar();
    
    
}



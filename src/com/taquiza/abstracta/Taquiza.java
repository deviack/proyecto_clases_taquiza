/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.taquiza.abstracta;

import com.taquiza.clases.Cpersistencia;
import com.taquiza.enumerados.Tipo;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author Kala
 */
public class Taquiza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        
    Scanner scan = new Scanner(System.in);
    System.out.println("¿Cuántos taquitos va a querer?");
        int num = scan.nextInt(); // escaneador.nextInt(); lee el siguiente int que se ingrese en la consola
        //System.out.println("Anotados " + num + " taquitos");
        
    String[] tacos = new String[7];//va del 0 a 11
       tacos[0] = "bistek";//en el espacio 0
       tacos[1] = "sudero";
       tacos[2] = "chorizo";
       tacos[3] = "adobada";
       tacos[4] = "lengua";
       tacos[5] = "pastor";
       tacos[6] = "barbacoa";
       
       System.out.println("Los taquitos que tenemos son: " + Arrays.toString(tacos));
       
       //ESTO TE DA LAS CALORÍAS ALOJADAS EN EL ENUM
       System.out.println("Las calorías de los tacos son: \n" + "Bistek: " + Tipo.BISTEK.getCalorias() + ". Suaperro: " +  Tipo.SUADERO.getCalorias() + ". Chorizo: " + Tipo.CHORIZO.getCalorias() + ". Adobada: " + Tipo.ADOBADA.getCalorias() + ". Lengua: " + Tipo.LENGUA.getCalorias() + ". Pastor: " + Tipo.PASTOR.getCalorias() + ". Guaguacoa: " + Tipo.BARBACOA.getCalorias());

       if (num==1)
          System.out.println("Uno de bistek");
        else 
           System.out.println("");
       
       
       //ESTO ES PARA IMPLEMENTAR LA ESCRITURA Y LUEGO PARA LEERLA. 
       Cpersistencia.escribirArchivo();
       Cpersistencia.leerArchivo();
       
       
    }
    
    
}

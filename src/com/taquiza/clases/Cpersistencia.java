/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.taquiza.clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Kala
 */
public class Cpersistencia {
    
    public static void escribirArchivo() {
		FileWriter escritor = null;//creamos el escritor tipo escritor
		try {
			
                        escritor = new FileWriter("Taquitos.txt",false); //si está lo agarra y si no lo crea. Lo manda a raíz del fichero
			//crea un buffer o flujo intermedio antes de escribir directamente en el archivo
			BufferedWriter escbuffer = new BufferedWriter(escritor); //lo guardamos en buffer
			//for (Pizza pizza : lista) {//for each pa recorrer la lista
				//escribe datos a partir del último dato escrito (cargado en buffer)
			//	escbuffer.write(pizza.getNombre()+"-"+Arrays.toString(pizza.getIngredientes())+"-"+
                          //             pizza.getPrecio()+"-"+pizza.isTatemada()+"\n");//Array.toString es un método de java para convertir a String
			//}
                        escbuffer.write("Los taquitos son amor infinito. ");//puedo poner la orden del usuario
			//cierra el buffer intermedio
			escbuffer.close();
			System.out.println("Se escribió correctamente su orden");

		} catch (IOException e) {//esto es pa cachar el error
			e.printStackTrace();
		} finally {
			if (escritor != null) {
				try {//cierra el flujo principal
					escritor.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
    }
    public static void leerArchivo() throws FileNotFoundException, IOException{
      
        try {   FileReader lector = new FileReader ("Taquitos.txt");
                BufferedReader br = new BufferedReader(lector); 
     
                // Lectura del fichero
                String linea;
                while((linea=br.readLine())!=null)
                System.out.println(linea);
         
        }catch(Exception e){
            e.printStackTrace();
         } 
    }
    
}

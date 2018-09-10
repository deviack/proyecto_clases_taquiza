/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.taquiza.abstracta;

import com.taquiza.clases.Cpersistencia;
import com.taquiza.clases.Taco;
import com.taquiza.enumerados.Tipo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kala
 */
public class Taquiza {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        //CREAMOS UN MENÚ DE LOS TACOS QUE HAY
        String[] tacos = new String[7];//va del 0 a 11
        tacos[0] = "bistek";//en el espacio 0
        tacos[1] = "suadero";
        tacos[2] = "chorizo";
        tacos[3] = "adobada";
        tacos[4] = "lengua";
        tacos[5] = "pastor";
        tacos[6] = "barbacoa";

        //  MOSTRAMOS EL MENÚ QUE CREAMOS
        System.out.println("Los taquitos que tenemos son: " + Arrays.toString(tacos));
        //ESTO TE DA LAS CALORÍAS ALOJADAS EN EL ENUM
        System.out.println("-----------------------------------------");
        System.out.println("Las calorías de los tacos son: \n" + "Bistek: " + Tipo.BISTEK.getCalorias() + ". Suaperro: " + Tipo.SUADERO.getCalorias() + ". Chorizo: " + Tipo.CHORIZO.getCalorias() + ". Adobada: " + Tipo.ADOBADA.getCalorias() + ". Lengua: " + Tipo.LENGUA.getCalorias() + ". Pastor: " + Tipo.PASTOR.getCalorias() + ". Guaguacoa: " + Tipo.BARBACOA.getCalorias() + "\n");

        boolean hayOrden = false;//Pa decirle que no hay orden (aunque sí haya físicamente en el .txt)

        int opcionMenu;
        do {
            opcionMenu = Taquiza.menu();//opcionMenu recibe el valor introducido en Taquiza.menu que debe ser entero
            switch (opcionMenu) {
                //LOS CASOS TOMAN EL NÚMERO(int) que introduce el usuario en el MENÚ
                case 6://SALIR. uel número introducido
                    System.out.println("Que le vaya bien, joven.");
                    break;//cada caso lleva break para no ciclarse ALV
                case 1://PEDIR ORDEN
                    Taquiza.pedirOrden();//es función, por eso lleva paréntesis. Si no se pone te imprime el método pero no lo ejecuta
                    hayOrden = true;
                    break;
                case 2://MOSTRAR ORDEN ACTUAL
                    if (hayOrden) {//revisa si hay orden
                        System.out.println("\n---------------");
                        System.out.println("Su orden hasta el momento es:");
                        Cpersistencia.leerArchivo();
                        System.out.println("--------------- ");
                    } else {
                        System.out.println("\n---------------");
                        System.out.println("Aún no ha ordenado nada :v");
                        System.out.println("--------------- ");
                    }
                    break;
                case 3://MODIFICAR ORDEN
                    if (hayOrden) {
                        System.out.println("\n---------------");
                        System.out.println("MODIFICAR ORDEN");
                        System.out.println("--------------- ");
                    } else {
                        System.out.println("\n---------------");
                        System.out.println("Aún no ha ordenado nada :v");
                        System.out.println("--------------- ");
                    }
                    break;
                case 4://ELIMINAR ORDEN
                    if (hayOrden) {
                        System.out.println("\n---------------");
                        System.out.println("ORDEN ELIMINADA");
                        Taquiza.eliminarOrden();
                        System.out.println("--------------- ");
                    } else {
                        System.out.println("\n---------------");
                        System.out.println("Aún no ha ordenado nada :v");
                        System.out.println("--------------- ");
                    }
                    break;
                case 5://FINALIZAR ORDEN
                    if (hayOrden) {
                        System.out.println("\n---------------");
                        System.out.println("FINALIZAR ORDEN");
                        System.out.println("--------------- ");
                    } else {
                        System.out.println("\n---------------");
                        System.out.println("Aún no ha ordenado nada :v");
                        System.out.println("--------------- ");
                    }

                    break;
            }
        } while (opcionMenu != 6);//mientras no elija SALIR, seguirá mandando el menú

    }

    // HACEMOS EL MENÚ PARA QUE EL USUARIO ELIJA OPCIONES 
//            int contador = 0;
//            Scanner scanMenu = new Scanner(System.in);
//        do{
//           
//           int numMenu = scanMenu.nextInt();
//           contador ++;
//        }while{(contador <= scanMenu);
//        }
    public static int menu() {
        int numMenu = 0;
        try {
            Scanner scanMenu = new Scanner(System.in);
            //
            System.out.println("¿Qué desea hacer? (Elija el número correspondiente):");
            System.out.println("1. Pedir orden de taquitos");
            System.out.println("2. Revisar la orden hasta el momento");
            System.out.println("3. Modificar la orden de taquitos");
            System.out.println("4. Eliminar la orden de taquitos");
            System.out.println("5. Finalizar la orden (mandarla a cocinar :3)");
            System.out.println("6. Salir");
            numMenu = scanMenu.nextInt();

        } catch (Exception e) {//se manda una variable de tipo Exception en "e"
            //e.printStackTrace();

            System.out.println("\n Valor incorreco. Introduzca una opción de las que se muestran abajo :v");
            Taquiza.menu();
        }
        return numMenu;//SI TRUENA TE REGRESA AL MENÚ
    }

    public static void eliminarOrden() throws IOException {
        
        File varF = new File("Taquitos.txt");
        if (!varF.exists()) {
            System.out.println("El archivo data no existe.");
        } else {
            
            varF.delete();
            varF.createNewFile();
            
            System.out.println("Se eliminó su orden");
        
//        //Con la clase File obtenemos una instancia del fichero que queremos manipular
//        String sFichero = "Taquitos.txt";
//        File varF = new File(sFichero);
//        //Ahora solo tenemos que enviar los dos comandos: el de borrado mediante el método .delete()
//        //y el de creación mediante el método .createNewFile()
//        varF.delete();
//        try {
//        varF.createNewFile();
//        } catch (IOException ioe) {
//        ioe.printStackTrace();
//        }
               
        }
        //    public static void modificarOrden () {
        //        //Con la clase File obtenemos una instancia del fichero que queremos manipular
        //        String sFichero = "Taquitos.txt";
        //        File varF = new File(sFichero);
        //        //Ahora solo tenemos que enviar los dos comandos: el de borrado mediante el método .delete()
        //        //y el de creación mediante el método .createNewFile()
        //        varF.delete();
        //        try {
        //        varF.createNewFile();
        //        } catch (IOException ioe) {
        //        ioe.printStackTrace();
        }
        
    public static void pedirOrden() {

        //  TOMAR ORDEN
        Scanner scan = new Scanner(System.in);//Creamos el scanner
        Scanner scan2 = new Scanner(System.in);//Creamos un segundo scanner
        ArrayList listaTacos = new ArrayList();//Aquí guardaremos los tacos ordenados
        //ArrayList listaTacosFinal = new ArrayList(listaTacos);//Aquí guardamos la orden final
        System.out.println("¿Cuántos taquitos va a querer?");

        int totalTacos = 1;//El contador empieza en 1 para enumerarlos en el menú
        int num = scan2.nextInt(); // lee el siguiente dato(int) que ingrese el usuario y lo guarda en scan2

        for (int i = 1; i <= num; i++) {
            Taco taco = new Taco();
            System.out.println("");
            System.out.println("¿De qué va a querer el taco " + i + "?");
            taco.setNombre(scan.nextLine());
            System.out.println("Todos cuestan $12");
            taco.setPrecio(12);
            taco.setNumero_de_tacos(i);
            listaTacos.add(taco);//adjuntamos a la lista de tacos que acabamos de crear     

        }

        for (int j = 0; j < listaTacos.size(); j++) {//Este contador empieza en 0 porque no es para mostrar, sólo contar
            //Se imprimen los tacos del Array
            System.out.println("-----------------------------------------");
            System.out.println("Taco número " + totalTacos++);
            Taco taco = (Taco) listaTacos.get(j);
            System.out.println("Taco de " + taco.getNombre());
            System.out.println("Cuesta " + taco.getPrecio());

        }

        System.out.println("xxxxxxxxxxxxxxxxxxxx");//Para separar lo anterior con la persistencia

        //ESTO ES PARA IMPLEMENTAR LA ESCRITURA Y LUEGO PARA LEERLA. 
        Cpersistencia.escribirArchivo(listaTacos);
        try {
            Cpersistencia.leerArchivo();
            
        } catch (IOException ex) {
            Logger.getLogger(Taquiza.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

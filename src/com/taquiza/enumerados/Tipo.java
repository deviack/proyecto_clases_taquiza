/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.taquiza.enumerados;

import java.util.ArrayList;

/**
 *
 * @author Kala
 */
public enum Tipo {//este es el enumerador
    BISTEK(300),SUADERO(350),CHORIZO(400),ADOBADA(300),LENGUA(250), PASTOR(290), BARBACOA(350);
    
    private int calorias;
    
    Tipo(){}
    Tipo(int calorias){
        this.calorias = calorias;
    }
    
   
    
    
//    lcalorias = {.ADOBADA.getCalorias(),Tipo.BARBACOA.getCalorias(), Tipo.BISTEK.getCalorias(),Tipo.CHORIZO.getCalorias(),Tipo.LENGUA.getCalorias(),Tipo.PASTOR.getCalorias(),Tipo.SUADERO.getCalorias()};
//    
//    String[] listaCalorias = new String[7];
//       listaCalorias[0] = Tipo.ADOBADA.getCalorias();
//       listaCalorias[1] = Tipo.BARBACOA.getCalorias();
//       listaCalorias[2] = Tipo.BISTEK.getCalorias();
//       listaCalorias[3] = Tipo.CHORIZO.getCalorias();
//       listaCalorias[4] = Tipo.LENGUA.getCalorias();
//       listaCalorias[5] = Tipo.PASTOR.getCalorias();
//       listaCalorias[6] = Tipo.SUADERO.getCalorias();

    /**
     * @return the calorias
     */
    public int getCalorias() {//AQUÍ NO SETTEAS PORQUE YA SETTEASTE ARRIBA SUS VALORES
        return calorias;
    }
    
    
}

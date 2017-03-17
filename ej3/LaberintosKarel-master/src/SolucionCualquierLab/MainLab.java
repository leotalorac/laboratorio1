/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SolucionCualquierLab;
import becker.robots.*;
/**
 *
 * 
 */
public class MainLab {
    public static void main(String[] args){
        City map = new City(11,11);
        
        // laberinto 1
      Escenario l = new Escenario(map);
       
       //laberinto 2
       
       // EscenarioKarel x = new EscenarioKarel();
       //x.EscenarioKarel(map);
      Recorre fran = new Recorre(map);
       fran.recorrer(map);
    }
}

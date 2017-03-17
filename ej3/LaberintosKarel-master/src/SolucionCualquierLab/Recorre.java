/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SolucionCualquierLab;
import becker.robots.*;
import java.awt.Color;
import java.util.Scanner;
/**
 *
 * @author BryanM
 */
public class Recorre {
    private Robot r ;
    
    
    public Recorre(City c){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite Posicion del Robot dentro del laberinto ");
     
        System.out.print("X = ");
        int x = sc.nextInt();
        System.out.print("Y = ");
        int y = sc.nextInt();
        
        r = new Robot(c,x,y,Direction.NORTH);
        
       
   
        
        
    }
    /**
     * 
     * @param c Ciudad de karel
     * Metodo que permite encontrar la solucion al laberinto
     */
    public void recorrer(City c){
        
   
       
    while (r.canPickThing()==false){
   r.turnLeft();
    while (r.frontIsClear()==false){
     this.izq();
    }
    r.move();
    }
    if(r.canPickThing()==true){
    r.pickThing();
    }
}
    /** 
     * Metodo que permite girar a la izquierda
     */
 private void izq(){
    for (int i = 0; i < 3; i++) {
    this.r.turnLeft(); 
    
    }
    
 }

    
   
        
    }
    
    
    
        
    
    

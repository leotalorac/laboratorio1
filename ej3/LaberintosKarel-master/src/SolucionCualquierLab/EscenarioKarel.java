/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SolucionCualquierLab;

import becker.robots.*;

/**
 *
 * @author usuario
 */
public class EscenarioKarel {
    City laberinto;
    Wall bloque[] = new Wall[34];
    /**
     * 
     * @param c Recibe ciudad de Karel
     */
    public void EscenarioKarel(City c){
       laberinto = c;
        int i;
        for(i=0; i<8;i++){
            
            bloque[i]= new Wall(laberinto,2,i+1,Direction.NORTH); 
            bloque[i]= new Wall(laberinto,9,i+1,Direction.SOUTH); 
            bloque[i]= new Wall(laberinto,i+2,1,Direction.WEST); 
        }
        
        for(i=0;i<7;i++){
            bloque[i]= new Wall(laberinto,i+2,8,Direction.EAST);
        }        
        
        
        for(i=0; i<7;i++){
            bloque[i]= new Wall(laberinto,8,i+2,Direction.SOUTH);
        }
        
        
        for(i=0;i<1;i++){
            bloque[i]= new Wall(laberinto,i+2,8,Direction.WEST);
        }
        for(i=0; i<6; i++){
            bloque[i]= new Wall(laberinto,3,i+1,Direction.NORTH);
            for(int j=0; j<6;j++){
            bloque[i]= new Wall(laberinto,3,j+3,Direction.SOUTH);
            }
        }
        for(i=0;i<3;i++){
            bloque[i]= new Wall(laberinto,4,i+1,Direction.SOUTH);
        }
        for(i=0;i<3;i++){
            bloque[i]= new Wall(laberinto,i+4,4,Direction.EAST);
        }
        for(i=0;i<3;i++){
            bloque[i]= new Wall(laberinto,5,i+2,Direction.SOUTH);
        }
        for(i=0;i<3;i++){
            bloque[i]= new Wall(laberinto,6,i+1,Direction.SOUTH);
        }
        for(i=0; i<7;i++){
            bloque[i]= new Wall(laberinto,7,i+1,Direction.SOUTH);
        }
        for(i=0; i<3;i++){
            bloque[i]= new Wall(laberinto,i+5,5,Direction.EAST);
        }
        for(i=0; i<3;i++){
            bloque[i]= new Wall(laberinto,i+4,6,Direction.EAST);
        }
        for(i=0; i<3;i++){
            bloque[i]= new Wall(laberinto,i+5,7,Direction.EAST);
        }
        
        // Thing 
        Thing exit = new Thing(laberinto,8,9);
    }
    
    
}

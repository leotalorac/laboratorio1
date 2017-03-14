/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alopaisa;
import java.util.Scanner;
/**
 *
 * @author lotalorafox
 */
public class inventario {
    private Scanner sc = new Scanner(System.in);
    Ingrediente[] i;
    Ingrediente[] ifaltantes;
    int Ningredientes;
    
    public inventario(){}
    public inventario(int n){
        i = new Ingrediente[n];
        
    }

    
    public void addIngredientes(int n,int h){
        String nombre;
        Ningredientes = n;
        float suel;
        for (int j = h; j < n; j++) {
            i[j] = new Ingrediente();
            System.out.println("ingresa el nombre del ingrediente ");
            nombre = sc.next();
            i[j].setName(nombre);
            System.out.println("ingresa su valor unitario");
            suel = sc.nextFloat();
            i[j].setValor(suel);
            System.out.println("ingresa su cantidad");
            int can = sc.nextInt();
            i[j].setCantidad(can);
            i[j].setId(j+1);
        }
    }
    
    public void listarIngredientesID(){
        for (int j = 0; j < Ningredientes; j++) {
            System.out.println(i[j].getName() + " ID: "+ i[j].getId());        
        }
    }
    
    public void eliminarIngrediente(int d){
        int s =0;
    
        for (int j = 0; j < Ningredientes; j++) {
            if( i[j].getId()==d ){   s =j;}     
        }
        System.out.println("cauntos usaste?");
        int h = sc.nextInt();
        h = i[s].getCantidad()- h;
        i[s].setCantidad(h);
        
    }
    
    public void listarInventario(){
        for (int j = 0; j < Ningredientes; j++) {
            System.out.println(i[j].getName() + " ID: "+ i[j].getId() + " Cantidad: " + i[j].getCantidad() + "Valor unitario: " + i[j].getValor());        
        }
    }

}

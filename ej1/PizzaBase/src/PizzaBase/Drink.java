/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PizzaBase;
import java.util.Scanner;

/**
 *
 * @author lotalorafox
 */
public class Drink {
    private String flavor;
    private String size;
    private float price;
    Scanner sc = new Scanner(System.in);
    
    public Drink(int s){
        if(s == 1){
            size = "small";
        }else{
            size = "Big";
        }
    }
    public void chooseflavor(){
        System.out.println("What flavor do you want from Drink?");
        System.out.println("1 for cola");
        System.out.println("2 for limonate ");
        System.out.println("3 for limonate of coconout");
        System.out.println("4 for limonate of Strawberry");
        int n = sc.nextInt();
        if(n==1){
            this.flavor = "cola";
            this.price = 3;
        }else if(n==2){
            this.flavor = "limonate";
            this.price = 5;
        }else if(n==3){
            this.flavor = "coconouts's limonate";
            this.price = 7;
        }else{
            this.flavor = "Strawberry's limonate";
            this.price = 8;
        }
    }
    public float getPrice(){
        return this.price;
  }
    public String getFlavor(){
        return this.flavor;
    }
    
    
}

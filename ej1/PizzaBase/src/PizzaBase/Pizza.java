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
public class Pizza {
    private Toppings[] ingredients;
    private int size;   
    private int n;
    private String flavorp;
    private float price;
    Scanner sc = new Scanner(System.in);
    
    public Pizza(int t){
        size = t;
    }
    
    public void doyourself(){
        System.out.println("How many ingredients do you want to add?");
        n = sc.nextInt();
        this.flavorp = "personalized";
        ingredients = new Toppings[n];
        String flavor;
        for(int i=0;i<n;i++){
            System.out.println("put the "+(1+i)+" ingredient");
            flavor = sc.next();
            ingredients[i] = new Toppings(flavor);
        }
        this.price += n*3*(size/3);
    }
    public void doprefab(){
        System.out.println("What flavor do you want from pizza?");
        System.out.println("1 for meets");
        System.out.println("2 for Hawaiian");
        System.out.println("3 for mexican");
        System.out.println("4 for Chicken and bacon");
        n = sc.nextInt();
        if(n==1){
            this.price = 15*size;
            this.flavorp = "meets";
        }else if(n==2){
            this.price = 10*size;
            this.flavorp = "Hawaiian";
        }else if(n==3){
            this.price = 18*size;
            this.flavorp = "mexican";
        }else{
            this.price = 12*size;
            this.flavorp = "Chiken and beacon";
        }
    }
    public float getPrice(){
        return price;
    }
    public String getFlavor(){
        return flavorp;
    }
    public void listIngredientes(){
        for(int i=0;i<n;i++){
            System.out.println(ingredients[i].name);
        }
    }






}

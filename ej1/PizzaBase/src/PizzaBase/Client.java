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
public class Client {
    private String name;
    private float total =0;
    public Pizza y,p;
    private Drink d;
    boolean p1=false,p2=false,dr = false;
    Scanner sc = new Scanner(System.in);
    
    
    public Client(String l){
        name = l;
    }
    
    public void orderPizza(int i){
        int t;
        
        switch(i){
            case 1:
                p1 =true;
                System.out.println("Enter the pizza's size (6, 9 or 12)");
                t= sc.nextInt();
                y = new Pizza(t);
                y.doyourself();
                this.total = this.total + y.getPrice();
                break;
            case 2:
                p2=true;
                System.out.println("Enter the pizza's size (6, 9 or 12)");            
                t = sc.nextInt();
                p = new Pizza(t);
                p.doprefab(); 
                this.total = this.total + p.getPrice();
                break;
        }
    }
    
    public void orderDrink(){
        int t; 
        dr =true;
        System.out.println("Enter the drink's size (1 for big,2 to small)");            
        t = sc.nextInt();
        d = new Drink(t);
        d.chooseflavor();
        this.total = this.total + d.getPrice();
    }

    
    public String getName(){
        return name;
    }
    
    public void orden(){
        if(p1){
            System.out.println("Ordered a pizza do yourselft, and the ingredients: ");
            y.listIngredientes();
            System.out.println("the price is: "+ y.getPrice());
        }
        if(p2){
            System.out.println("Ordered a pizza prefab, of flavor ");
            System.out.println(p.getFlavor());
            System.out.println("the price is: "+ p.getPrice());
        }
        if(dr){
            System.out.println("Ordered a drink , and the flavor is: ");
            System.out.println(d.getFlavor());
            System.out.println("the price is: "+ d.getPrice());
        }
        
        System.out.println("the Amount to cancel is: ");
        System.out.println("$ " + this.total);
        
        
    }
    
}

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
public class main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         boolean p = true;                 
         System.out.println("wellcome to Pizza Base please put your name to continue: ");
         String s = sc.next();
         Client c = new Client(s);
         System.out.println("hello " + c.getName());
         while(p){
            System.out.println("What do you want to order? (please select a number)");
            System.out.println("1 to order a do yourself pizza");
            System.out.println("2 to order a prefab pizza");
            System.out.println("3 to add a drink");
            System.out.println("4 to finish the order");
            int e = sc.nextInt();
            int t;
            switch(e){
                case 1:
                    c.orderPizza(1);
                    break;
                case 2:
                    c.orderPizza(2);
                    break;
                case 3:
                    c.orderDrink();
                    break;
                case 4:
                    p = false;
                    break;
            }
        }
        System.out.print("Preparando...."); 
        for(int i=0;i<200;i++){
            if(i%2==0){
                System.out.print(".");
            }
        }
        System.out.println("your pizza is ready!!!");
        c.orden();
         
         
         
         
    }
    
}

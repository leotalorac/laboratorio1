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
public class Nomina {
    private Empleado[] e;
    private Scanner sc = new Scanner(System.in);
    private int Nempleados;
    
    public Nomina(int n){
        e = new Empleado[n];
    }
    public Nomina(){}
    
    
    public void addEmpleados(int n,int h){
        String nombre;
        Nempleados = n;
        float suel;
        for (int i = h; i < n; i++) {
            e[i] = new Empleado();
            System.out.println("ingresa el nombre del nuevo empleado: ");
            nombre = sc.next();
            e[i].setName(nombre);
            System.out.println("ingresa su sueldo mensual");
            suel = sc.nextFloat();
            e[i].setSueldo(suel);
            e[i].setId(i+1);
        }
    }
    
    public void listarEmpleadosID(){
        for (int i = 0; i < Nempleados; i++) {
            System.out.println(e[i].getName() + " ID: "+ e[i].getId());        
        }
    }
    public void listarEmpleados(){
        for (int i = 0; i < Nempleados; i++) {
            System.out.println(e[i].getName() + " ID: "+ e[i].getId() + " Sueldo " + e[i].getSueldo()+" Horas trabajadas: " + e[i].getHoras());        
        }
    }
    
    public void  editar(int n){
        int s =0;
    
        for (int i = 0; i < Nempleados; i++) {
            if(e[i].getId()==n){   s =i;}     
        }
        System.out.println("introduce nuevo nombre");
        String nom = sc.next();
        e[s].setName(nom);
        System.out.println("introduce nuevo sueldo");
        float suel = sc.nextFloat();
        e[s].setSueldo(suel);
    }
    
    public void marcarE(int w){
       int s =0;
    
        for (int i = 0; i < Nempleados; i++) {
            if(e[i].getId()==w){   s =i;}     
        }
        System.out.println("introduce la hora de entrada en formato 24");
        int en = sc.nextInt();
        e[s].e = en;
        
    }
    public float marcarS(int w){
       int s =0;
    
        for (int i = 0; i < Nempleados; i++) {
            if(e[i].getId()==w){   s =i;}     
        }
        System.out.println("introduce la hora de entrada en formato 24");
        int es = sc.nextInt();
        e[s].s =es;
        System.out.println(e[s].getE()+" " + e[s].getS());
        float h1 = e[s].getHoras();
        e[s].addHoras();
        float h2 = e[s].getHoras();
        return gastoS(e[s],h1,h2);
    }
    
    public float gastoS(Empleado emplo,float h1,float h2){
        float val = (h2-h1)*(emplo.getSueldo()/180);
        return val;
    }
    
}

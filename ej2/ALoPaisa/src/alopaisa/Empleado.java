/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alopaisa;

/**
 *
 * @author lotalorafox
 */
public class Empleado {
    private String name;
    private float sueldo;
    private float horas =0;
    private int id;
    public int e;
    public int s;
    
    
    public Empleado(){
    }
    
    public void setName(String n){
        name = n;
    }
    public void setSueldo(float n){
        sueldo =n;
    }
    public void setId(int n){
        id = n;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public float getSueldo() {
        return sueldo;
    }

    public float getHoras() {
        return horas;
    }

    public void addHoras() {
        this.horas += (this.s -this.e) ;
    }

    public void setE(int e) {
        this.e = e;
    }

    public void setS(int s) {
        this.s = s;
    }

    public int getE() {
        return e;
    }

    public int getS() {
        return s;
    }
    
    
    
    
    
    
    
    
}

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
public class Ingrediente {
    String Name;
    float valor;
    int cantidad;
    int id;

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public float getValor() {
        return valor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getId() {
        return id;
    }
    
    
    
}

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
public class Gasto {
    Fecha f;
    float valor;
    String Descripcion;
    
    public Gasto(Fecha fa){
        f =fa;
    }

    public void setF(Fecha f) {
        this.f = f;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Fecha getF() {
        return f;
    }

    public float getValor() {
        return valor;
    }

    public String getDescripcion() {
        return Descripcion;
    }
    
    
}

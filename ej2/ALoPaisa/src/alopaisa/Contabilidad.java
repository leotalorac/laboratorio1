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
public class Contabilidad {
    private Scanner sc = new Scanner(System.in);
    private float totalCredito;
    private float totalDevito;
    private float totalNeto;
    private Gasto g[] = new Gasto[1000];
    private Ingreso in[] = new Ingreso[1000];
    private int gastosinicializados = 0;
    private int ingresosinicializados = 0;
    
    public Contabilidad(){
        totalCredito =0;
        totalDevito=0;
        totalNeto=0;
    }
    
    public void CrearGasto(Fecha f1,int gi,int n){
        
        
        for (int i = gi; i < n; i++) {
           g[i] = new Gasto(f1);
           System.out.println("Ingresa el nombre del gasto:");
           String de = sc.next();
           g[i].setDescripcion(de);
           System.out.println("Ingresa el valor del gasto:");
           int v = sc.nextInt();
           g[i].setValor(v);
           this.totalDevito+=g[i].getValor();
        }
        this.gastosinicializados += n-gi;
        this.calctotal();
            
        
    }
    public void CrearIngreso(Fecha f1,int gi,int n){
        for (int i = gi; i < n; i++) {
           in[i] = new Ingreso(f1);
           System.out.println("Ingresa el nombre del ingreso:");
           String de = sc.next();
           in[i].setDescripcion(de);
           System.out.println("Ingresa el valor del ingreso:");
           int v = sc.nextInt();
           in[i].setValor(v);
           this.totalCredito+=in[i].getValor();
        }
        this.ingresosinicializados+=n;
        this.calctotal();
    }
    
    public void calctotal(){
        this.totalNeto = this.totalCredito - this.totalDevito;
    }

    public float getTotalCredito() {
        return totalCredito;
    }

    public float getTotalDevito() {
        return totalDevito;
    }

    public float getTotalNeto() {
        return totalNeto;
    }
    public void ConsultarDia(Fecha fa){
        System.out.println("Gastos: ");
        int gt = 0;
        int it = 0;
        
        for (int i = 0; i < gastosinicializados; i++) {
            if(g[i].f == fa){
                System.out.println("Gasto: " + g[i].getDescripcion() + " Valor: " + g[i].getValor() + " Fecha: " + g[i].f.dia + "/" + g[i].f.mes + "/" + g[i].f.year);
                 gt += g[i].getValor();
            }
        }
        System.out.println("Gastos Totales el dia:"+ fa.dia + "/" + fa.mes + "/" + fa.year + " = " + gt);
        System.out.println("Ingresos: ");
        for (int i = 0; i < ingresosinicializados; i++) {
            if(in[i].f == fa){
                System.out.println("Ingreso: " + in[i].getDescripcion() + " Valor: " + in[i].getValor() + " Fecha: " + in[i].f.dia + "/" + in[i].f.mes + "/" + in[i].f.year);
                it += in[i].getValor();
            }
        }
        System.out.println("ingresos totales  Totales el dia: "+ fa.dia + "/" + fa.mes + "/" + fa.year + " = " +it);
        System.out.println("ganancia neta totales  Totales el dia: "+ fa.dia + "/" + fa.mes + "/" + fa.year + " = " +(it-gt));
    }
    
    public void CrearGastoS(Fecha f, float v,int d){
        g[gastosinicializados] = new Gasto(f);
        g[gastosinicializados].setDescripcion("sueldo del empleado ID" + d );
        g[gastosinicializados].setValor(v);
        gastosinicializados++;
        
    }
    
    public void ConsultarMes(Fecha fa){
        System.out.println("Gastos: ");
        int gt = 0;
        int it = 0;
        
        for (int i = 0; i < gastosinicializados; i++) {
            if((g[i].f.mes == fa.mes) && (g[i].f.year == fa.year)){
                System.out.println("Gasto: " + g[i].getDescripcion() + " Valor: " + g[i].getValor() + " Fecha: " + g[i].f.dia + "/" + g[i].f.mes + "/" + g[i].f.year);
                 gt += g[i].getValor();
            }
        }
        System.out.println("Gastos Totales el dia:"+ fa.dia + "/" + fa.mes + "/" + fa.year + " = " + gt);
        System.out.println("Ingresos: ");
        for (int i = 0; i < ingresosinicializados; i++) {
            if(in[i].f.mes == fa.mes&& (in[i].f.year == fa.year)){
                System.out.println("Ingreso: " + in[i].getDescripcion() + " Valor: " + in[i].getValor() + " Fecha: " + in[i].f.dia + "/" + in[i].f.mes + "/" + in[i].f.year);
                it += in[i].getValor();
            }
        }
        System.out.println("ingresos totales  Totales el mes: " + fa.mes + "/" + fa.year + " = " +it);
        System.out.println("ganancia neta totales  Totales el mes: " + fa.mes + "/" + fa.year + " = " +(it-gt));
    }
    
    public void ConsultarYear(Fecha fa){
        System.out.println("Gastos: ");
        int gt = 0;
        int it = 0;
        
        for (int i = 0; i < gastosinicializados; i++) {
            if( g[i].f.year == fa.year){
                System.out.println("Gasto: " + g[i].getDescripcion() + " Valor: " + g[i].getValor() + " Fecha: " + g[i].f.dia + "/" + g[i].f.mes + "/" + g[i].f.year);
                 gt += g[i].getValor();
            }
        }
        System.out.println("Gastos Totales el dia:"+ fa.dia + "/" + fa.mes + "/" + fa.year + " = " + gt);
        System.out.println("Ingresos: ");
        for (int i = 0; i < ingresosinicializados; i++) {
            if(in[i].f.year == fa.year){
                System.out.println("Ingreso: " + in[i].getDescripcion() + " Valor: " + in[i].getValor() + " Fecha: " + in[i].f.dia + "/" + in[i].f.mes + "/" + in[i].f.year);
                it += in[i].getValor();
            }
        }
        System.out.println("ingresos totales  Totales el año: "+ fa.year + " = " +it);
        System.out.println("ganancia neta totales  Totales el año: " + fa.year + " = " +(it-gt));
    }
    
    
    
}

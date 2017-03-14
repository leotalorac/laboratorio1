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
public class ALoPaisa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean correr =true;
        Nomina nom = new Nomina(); 
        Contabilidad con = new Contabilidad();
        inventario in = new inventario();
        Fecha hoy = new Fecha(); 
        int o4;
        int gi=0;
        int ii=0;
        int ing =0;
        boolean f =true;
        while(correr){
            Scanner sc = new Scanner(System.in);
            System.out.println("Bienvenido al software contable de A lo paisa ");
            if(f){
                System.out.println("Para comenzar ingresa la fecha dia mes año");
                int d,m,a;
                d = sc.nextInt();
                m = sc.nextInt();
                a = sc.nextInt();
                hoy.dia = d;
                hoy.mes = m;
                hoy.year = a;
                f =false;
            }
            System.out.println("Que deseas hacer?");
            System.out.println("1: ingresar los empleados, editar empleados, marcar horas de salida o entrada de los empleados ");
            System.out.println("2: agregar, quitar o listar los ingredientes del inventario");
            System.out.println("3: marcar una venta o un gasto ");
            System.out.println("4: Finalizar dia");
            System.out.println("5: SALIR ");
            int o = sc.nextInt();
            switch(o){
                case 1:
                    System.out.println("has marcado la opcion 1, que deseas hacer?");
                    System.out.println("1: ingresar un empleado nuevo");
                    System.out.println("2: editar un empleado");
                    System.out.println("3: listar los empleados");
                    System.out.println("4: marcar la entrada");
                    System.out.println("5: marcar la salida");
                    System.out.println("6: SALIR ");
                    int o2 = sc.nextInt();
                    switch(o2){
                        case 1:
                            System.out.println("es la primera vez que ejecutas el sistema? 1: SI 2: NO");
                            int o3 = sc.nextInt();
                            switch(o3){
                                case 1:
                                    System.out.println("Cuantos empleados tienes? o planeas tener?");
                                    o4 = sc.nextInt();
                                    nom = new Nomina(o4);
                                    System.out.println("cuantos empleados quieres adicionar?");
                                    int ne = sc .nextInt();
                                    nom.addEmpleados(ne,0);
                                    break;
                                case 2:
                                    System.out.println("cuantos empleados quieres adicionar? recuarda que debes indicar cuantos empleados tienes actualmente posteriormente.");
                                    int no = sc .nextInt();
                                    int na = sc.nextInt();
                                    nom.addEmpleados(no,na);
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("selecciona el id del empleado de los existentes");
                            nom.listarEmpleadosID();
                            int h = sc.nextInt();
                            nom.editar(h);
                            break;
                        case 3:
                            nom.listarEmpleados();
                            break;
                        case 4:
                            System.out.println("selecciona el id del empleado de los existentes");
                            nom.listarEmpleadosID();
                            int w = sc.nextInt();
                            nom.marcarE(w);
                            break;
                        case 5:
                            System.out.println("selecciona el id del empleado de los existentes");
                            nom.listarEmpleadosID();
                            int m = sc.nextInt();
                            float val = nom.marcarS(m);
                            con.CrearGastoS(hoy, val, m);
                            gi++;
                            break;
                        case 6:
                            break;
                    }
                    break;
            case 2:
                    System.out.println("has marcado la opcion 2, que deseas hacer?");
                    System.out.println("1: agregar ingrediente el inventario");
                    System.out.println("2: eliminar un ingrediente del inventario");
                    System.out.println("3: listar inventario");
                    System.out.println("4: SALIR ");
                    int la = sc.nextInt();
                    switch(la){
                        case 1:
                            System.out.println("es la primera vez que ejecutas el sistema? 1: SI 2: NO");
                            int o3 = sc.nextInt();
                            switch(o3){
                                case 1:
                                    System.out.println("Cuantos espacios para ingredientes tienes? o planeas tener?");
                                    o4 = sc.nextInt();
                                    in = new inventario(o4);
                                    System.out.println("cuantos ingredientes quieres adicionar?");
                                    int ne = sc .nextInt();
                                    in.addIngredientes(ne,ing);
                                    ing++;
                                    break;
                                case 2:
                                    System.out.println("cuantos ingredientes quieres adicionar?");
                                    int ns = sc .nextInt();
                                    in.addIngredientes(ns,0);
                                    break;
                                
                            }
                            break;
                        case 2:
                            System.out.println("cuantos ingredientes quieres eliminar? recuerda sus id");
                            in.listarIngredientesID();
                            int d = sc.nextInt();
                            in.eliminarIngrediente(d);
                            break;
                        case 3:
                            in.listarInventario();
                            break;
                        case 4:
                            break; 

                    }
                break;
            case 3:
                System.out.println("has seleccionado 3, escoge una opcion");
                System.out.println("1: añadir gasto");
                System.out.println("2: añadir ingreso");
                System.out.println("3: obtener balanze ");
                int c = sc.nextInt();
                switch(c){
                    case 1:
                        System.out.println("cuantos gastos vas a adicionar");
                        int n = sc.nextInt()+gi;
                        con.CrearGasto(hoy,gi,n);
                        gi+=n;
                        break;
                    case 2:
                        System.out.println("cuantos ingresos vas a adicionar");
                        int m = sc.nextInt();
                        con.CrearIngreso(hoy,ii,m);
                        ii+=m;
                        break;
                    case 3:
                        System.out.println("total debe " + con.getTotalDevito());
                        System.out.println("total credito " + con.getTotalCredito());
                        System.out.println("total neto " + con.getTotalNeto());
                        break;
                }
                break;  
            case 4:
                System.out.println("Has finalizado dia");
                System.out.println("deseas conocer el registro de hoy u otro dia? 1: SI 2:NO");
                int o6 = sc.nextInt();
                switch(o6){
                    case 1:
                        System.out.println("1: Registro de hoy 2: dia especifico");
                        int o7 = sc.nextInt();
                        if(o7 ==1){
                            con.ConsultarDia(hoy);
                        }else{
                            System.out.println("Para comenzar ingresa la fecha dia mes año");
                            int d,m,a;
                            d = sc.nextInt();
                            m = sc.nextInt();
                            a = sc.nextInt();
                            Fecha fe2 = new Fecha(d,m,a);
                            con.ConsultarDia(fe2);
                        }
                        
                        break;
                    case 2:
                        System.out.println("dia acabado correctamente");
                        f =true;
                        System.out.println("iniciando nuevo dia.............");
                        break;
                }
                break;
            case 5:
                correr =false;
                break;

            }
        
        
        } 
        
    }
    
}

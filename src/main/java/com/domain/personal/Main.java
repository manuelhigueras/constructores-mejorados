/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain.personal;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    //psvm
    public static void main(String[] args) {
        
        //Empleado ingeniero = new Empleado(800, 19-2019-02);
        Empleado e = new Empleado();
        System.out.println(e.getDetails());
        e.saluda();
        
        Ingeniero i = new Ingeniero();
        System.out.println(i.getDetails());
        i.saluda();
        
        Gerente g = new Gerente();
        g.departamento = "Marketing";
        g.salario = 700;
        System.out.println(g.getDetails());
        g.saluda();
        
        Director d = new Director();
        d.vehiculoEmpresa = 5;
        System.out.println(d.getDetails());
        
        d.aumentarComision();
        d.saluda();
        
        Empleado luis = new Gerente();
        Empleado persona = new Secretario();
        //persona = new Director();
        Object o = new Gerente();
        
        felicidadesNavidad(d);
        //felicidadesNavidad(new Ingeniero());
        
        Gerente g1 = new Gerente("Ramon", "Marketing");
        //Director d1 = new Director(20_000.0, "Roberto", "Direccion Informatica");
       // Empleado e1 = new Empleado("Rosario Bilbao", "Ventas");
        
        
        
    }
    
    public static void felicidadesNavidad(Director e){
        System.out.println("FELIZ NAVIDAD");
        e.saluda();
//        if(e instanceof Ingeniero){
//            System.out.println("... Tomatelo con mas calma y vete de vacaciones por un 1 año");
//        }
    }
    
}

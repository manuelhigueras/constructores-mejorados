/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain.personal;

import java.util.Date;

/**
 *
 * @author user
 */
public class Ingeniero extends Empleado{
    
    public Ingeniero(String nombre, double sueldo) {
        super(nombre, sueldo);
    }
    
    public Ingeniero() {
        super();
    }

    public Ingeniero(double salario, Date fechaNacimiento) {
        super(salario, fechaNacimiento);
    }
    
    @Override
    public String getDetails() {
        return "Ingeniero{" + "nombre=" + nombre + ", salario=" + salario +
                ", fechaNacimiento=" + fechaNacimiento + "}";
    }
    
    @Override
    public void saluda(){
        System.out.println("hola soy Ingeniero");
    }
    
}

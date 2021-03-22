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
public class Secretario extends Empleado{
    
    public Secretario() {
        super();
    }

    public Secretario(double salario, Date fechaNacimiento) {
        super(salario, fechaNacimiento);
    }

    public Secretario(String nombre, double salario) {
        super(nombre, salario);
    }      
    
    @Override
    public String getDetails() {
        return "Secretario{" + "nombre=" + nombre + ", salario=" + salario +
                ", fechaNacimiento=" + fechaNacimiento + "}";
    }
    
    @Override
    public void saluda(){
        System.out.println("hola soy Secretario");
    }
    
}

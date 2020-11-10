/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain;

import java.util.Date;

/**
 *
 * @author user
 */
public class Secretario extends Empleado{
    
    public Secretario() {
        super();
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

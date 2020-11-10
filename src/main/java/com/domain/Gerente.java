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
public class Gerente extends Empleado{
    public String departamento;

    public Gerente() {
        super();
    }
    
    @Override
    public String getDetails() {
        return "Gerente{" + "nombre=" + nombre + ", salario=" + salario +
                ", fechaNacimiento=" + fechaNacimiento + ", Gerente de " + departamento + "}";
    }
    
    @Override
    public void saluda(){
        System.out.println("hola soy Gerente");
    }
    
}

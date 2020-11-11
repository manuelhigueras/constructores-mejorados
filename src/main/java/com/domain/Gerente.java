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
    
    public Gerente(String nombre, double sueldo) {
        super(nombre, sueldo);
    }
    
    public Gerente(String nombre, double sueldo, String dep) {
        super(nombre, sueldo);
        this.departamento = dep;
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
    
    public void organizarDepartamento(){
        System.out.println("...Organizo el departamento de " + departamento);
    }
    
}

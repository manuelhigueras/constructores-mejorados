/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain.herencia;

import com.domain.personal.Empleado2;

/**
 *
 * @author user
 */
public class Empleado {
    protected String nombre;
    public Empleado(){
        //super();
        this.nombre = "";
    }
    public Empleado(String g){
        this.nombre = g;
    }
}

class Gerente extends Empleado2{
    protected String departamento;
    
    public Gerente(String nombre, double salario, String departamento){
        super(nombre, salario);
        this.departamento = departamento;
    }

    public Gerente() {
        
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
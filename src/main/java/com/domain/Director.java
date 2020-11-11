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
public class Director extends Empleado{
    public double vehiculoEmpresa;

    public Director() {
        super();
    }
    
    public void aumentarComision(){
        System.out.println(".... aumento mi comision");
    }
    
    @Override
    public String getDetails() {
        return "Director{" + "nombre=" + super.getNombre() + ", salario=" + salario +
                ", fechaNacimiento=" + fechaNacimiento + ", vehiculo de Empresa =" + vehiculoEmpresa + "}";
    }
    
    @Override
    public void saluda(){
        System.out.println("hola soy Director");
    }
    
}

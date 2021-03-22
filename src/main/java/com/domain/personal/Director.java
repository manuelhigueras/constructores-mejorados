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
public class Director extends Empleado2{
    public double vehiculoEmpresa;

    public Director(double vehiculoEmpresa, String nombre, double salario, String departamento, Date fechaNacimiento) {
        super(salario, departamento, fechaNacimiento);
        this.vehiculoEmpresa = vehiculoEmpresa;
    }

    public Director(double vehiculoEmpresa, String nombre, double salario) {
        super(nombre, salario);
        this.vehiculoEmpresa = vehiculoEmpresa;
    }
    
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

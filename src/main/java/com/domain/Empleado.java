/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain;

import java.util.Date;

/**
 * Clase que modela un empleado
 * @author user
 */
public class Empleado {
    public String nombre = "";
    public double salario;
    public Date fechaNacimiento;

    public Empleado(double salario, Date fechaNacimiento) {
        this.salario = salario;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Empleado() {
        this.nombre = "";
        this.salario = 0;
    }

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    
    public String getDetails() {
        return "Empleado{" + "nombre=" + nombre + ", salario=" + salario + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public void saluda(){
        System.out.println("hola soy empleado");
    }
    
}

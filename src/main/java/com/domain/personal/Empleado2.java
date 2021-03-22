/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain.personal;

import java.util.Date;

/**
 * Clase que modela un empleado
 * @author user
 */
public class Empleado2 {
    protected String nombre = "";
    protected double salario;
    public Date fechaNacimiento;
    public String departamento;
    public static final double SALARIO_BASE = 15_000.0;
    
    //CONSTRUCTORES
    
    public Empleado2(String nombre, double salario, Date fechaNacimiento) {
        System.out.println("CONSTRUCTOR1");
        this.nombre = nombre;
        this.salario = salario;
        this.fechaNacimiento = fechaNacimiento;
        System.out.println(toString());
    }
    
    public Empleado2(String nombre, double salario){
        this(nombre, salario, null);
        System.out.println("CONSTRUCTOR2");
        System.out.println(toString());
    }
    
    public Empleado2(String nombre){
        this(nombre,0);
        System.out.println("CONSTRUCTOR3");
        System.out.println(toString());
    }
    
    public Empleado2(){
        this("",0);
        System.out.println("CONSTRUCTOR4");
        System.out.println(toString());
    }

    public Empleado2(double salario, String departamento, Date fechaNacimiento) {
        this.salario = salario;
        this.departamento = departamento;
        this.fechaNacimiento = fechaNacimiento;
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
    
    public void saluda(String msg){
        System.out.println(msg + " empleado");
    }

    @Override
    public String toString() {
        return "Empleado2{" + "nombre=" + nombre + ", salario=" + salario + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
}

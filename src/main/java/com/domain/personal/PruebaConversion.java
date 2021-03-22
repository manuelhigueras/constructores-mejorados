/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain.personal;

/**
 *
 * @author user
 */
public class PruebaConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //1.CREA UN INGENIERO
        //2.CREA UN GERENTE
        //LLAMAR AL METODO iniciarJoarnada para ING Y GER
        Ingeniero persona = new Ingeniero("Miguel",800);
        Gerente persona2 = new Gerente("Luis",1500, "Informatica");
        iniciarJornada(persona);
        iniciarJornada(persona2);
        PruebaConversion pc = new PruebaConversion();
        pc.iniciarJornada(persona);
        pc.iniciarJornada(persona2);
    }
    
    public static void iniciarJornada(Empleado e){
        //1.SALUDO
        e.saluda();
        //2. SI ES GERENTE organizaDepartamento
        if(e instanceof Gerente){
             ((Gerente) e).organizarDepartamento();
        }
        //FIN DEL EJERCICIO
    }
     
}

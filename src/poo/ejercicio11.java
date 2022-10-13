/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author NALDO
 */
public class ejercicio11 {

    /**
     * Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        
        System.out.println("ingrese el año");
        int anio = leer.nextInt();
        System.out.println("ingrese el mes");
        int mes = leer.nextInt();
        System.out.println("ingrese el dia");
        int dia = leer.nextInt();
        
        Date fecha = new Date (anio-1900,mes-1,dia);
        Date fechaActual = new Date();
        
        String fechaCadena = fecha.toString();
        System.out.println("fecha ingresada: "+fechaCadena);
        String fechaCadena2 = fechaActual.toString();
        System.out.println("fecha en este momento: "+fechaCadena2);
        
        System.out.println("Entre la fecha ingresada y la actual, hay "+(fechaActual.getYear()-fecha.getYear())+" años de diferencia");
    }
    
}

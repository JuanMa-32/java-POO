/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.Arrays;

/**
 *
 * @author NALDO
 */
public class ejercicio10 {

    /**
     *Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double [] arregloA = new double [50];
        
        //lleno el arreglo A con numeros aleatorios
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i]= Math.random()*20;
        }
        imprimirA(arregloA);
        
        //funcion para ordenar de menor a mayor el arreglo
        Arrays.sort(arregloA);
        
        //creo otro arreglo y copio las primeras 10 posiciones del arregloA
        double[] arregloB =   Arrays.copyOf(arregloA, 20);
      
        
        //funcion para inizializar un arreglo desde hasta con un valor
        Arrays.fill(arregloB, 10, 20, 0.5);
        
        System.out.println("----------ARREGLO A ORDENADO");
        imprimirA(arregloA);
        
        System.out.println("----------ARREGLO B COMBINADO");
        imprimirB(arregloB);
    }
    
    
    //metodo para imprimir los arreglos
    public static void imprimirA(double arregloA []){
        
        
        for (int i = 0; i < arregloA.length; i++) {
            System.out.println(arregloA[i]);
        }
       
    }
    
    public static void imprimirB(double arregloB []){
        
           for (int i = 0; i < arregloB.length; i++) {
               System.out.println(arregloB[i]);
        }
    }
}

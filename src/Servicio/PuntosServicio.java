/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import entidad.Puntos;
import java.util.Scanner;

/**
 *crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos.
 */
public class PuntosServicio {
    Scanner leer= new Scanner (System.in);
    
    public Puntos crearPuntos(){
        
        Puntos p1 = new Puntos();
        
        System.out.println("ingrese valores para el primer punto \n"
                + "X1:\n"
                + "Y1:\n");
        p1.setX1(leer.nextInt());
        p1.setY1(leer.nextInt());
        
         System.out.println("ingrese valores para el segundo punto \n"
                + "X2:\n"
                + "Y2:\n");
         p1.setX2(leer.nextInt());
         p1.setY2(leer.nextInt());
         
         return p1;
    }
    
    public void calcularDistancia(Puntos p1){
        double distancia;
        
       
             
        distancia=Math.sqrt(  Math.pow(p1.getX2()-p1.getX1(), 2) +   Math.pow(p1.getY2()-p1.getY1(), 2));
        System.out.println("La distancia entre el P1 y el P2 es: "+distancia);
    }
}

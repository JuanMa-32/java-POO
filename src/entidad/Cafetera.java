/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

/**
 *Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 *
 */
public class Cafetera {
    
    Scanner leer = new Scanner (System.in);
    private double capacidadMax;
    private double cantidadActual;

    //constructores
    public Cafetera() {
    }

    public Cafetera(double capacidadMax, double cantidadActual) {
        this.capacidadMax = capacidadMax;
        this.cantidadActual = cantidadActual;
    }
 

    public void llenarCafetera(){
        cantidadActual = capacidadMax;
        
        
    }

    
    public void servirTaza(int taza){
         
        
        cantidadActual=cantidadActual*1000;
        
      
       if (taza<cantidadActual){
           System.out.println("su taza fue llenada correctamente");
       }else{
           System.out.println("no hay suficiente cafe");
           System.out.println("Falto "+((taza/cantidadActual)*10)+"% para ser llenada ");
       }
        
    }
  
    public void vaciarCafetera(){
        cantidadActual=0;
        System.out.println("cafe en la cafetera: "+cantidadActual);
    }
    public void agregarCafe(int agregar){
        cantidadActual+=agregar;
        System.out.println("cafe en la cafetera: "+cantidadActual);
    }

   
    
}

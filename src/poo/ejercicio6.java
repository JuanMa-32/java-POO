/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author NALDO
 */
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        
         System.out.println("ingrese la capacidad maxima de la cafetera en L");
         Cafetera c1 = new Cafetera(leer.nextDouble(),0);
         c1.llenarCafetera();
         int opcion;
         boolean flag=true;
         
       while (flag){
       

         System.out.println("-----------------");
            System.out.println("ingrese su opcion \n"
                    + "1. Servir taza\n"
                    + "2. Vaciar cafetera\n"
                    + "3. Agregar cafe \n"
                    + "4. salir\n ");
            System.out.println("-----------------");
            opcion = leer.nextInt();
            System.out.println("-----------------");
            switch (opcion){
                case 1:
                    System.out.println("ingrese el tamaño de su taza en ML: ");
                    c1.servirTaza(leer.nextInt());
                    break;
                case 2:
                      c1.vaciarCafetera();
                      break;
                case 3:
                     System.out.println("agrege cafe a su cafetera");
                    c1.agregarCafe(leer.nextInt());
                    break;
                case 4:
                     System.out.println("saliendo...");
                    flag=false;
                    break;
               
                    
            }

        
        
       
       }
    }
    
}
 
       
        
       
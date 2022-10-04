/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author NALDO
 */
public class LibroServicio {
    
    
    public Libro DatosServicio(){
        
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        Libro l1 = new Libro();
        
        System.out.println("ingrese el ISBN del libro:");
        l1.setIsbn(leer.nextInt());
        System.out.println("ingrese el titulo del libro:");
        l1.setTitulo(leer.next());
        System.out.println("ingrese el autor del libro:");
        l1.setAutor(leer.next());
        System.out.println("ingrese el numero de paginas del libro:");
        l1.setnPaginas(leer.nextInt());
        
          return l1;
    }
    
}

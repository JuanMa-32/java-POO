/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import entidad.Cadena;
import java.util.Scanner;

/**
 *
 *Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String)
y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
través de los métodos set, se guardará la frase y la longitud de manera automática según
la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:

 */
public class ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner leer = new Scanner (System.in).useDelimiter("\n");
            Cadena c1 = new Cadena();
            
            System.out.println("Ingrese una frase");
            String fras = leer.next();
            int largo = fras.length();
            
            //setteo la frase y el largo
            c1.setFrase(fras);
            c1.setLongitud(largo);
            
            //llamo al metodo para mostrar las vocales que contiene la frase
            System.out.println("La frase contiene "+c1.mostrarVocales()+" VOCALES");
            
            //llamo al metodo que invierte la frase
            System.out.println("----------------FRASE INVERTIDA-----------------");
            c1.invertirFrase();
            System.out.println("------------------------------------------------");
            
            //pido el caracter que quiere encontrar en la frase y llamo al metodo
            System.out.println("Ingrese que caracter quiere saber cuantas veces se repite:");
            String letra = leer.next();
            System.out.println("El caracter "+letra+" se repite "+c1.vecesRepetido(letra)+" veces");
            System.out.println("------------------------------------------------");
            
            //pido ingresar una nueva frase para comparar digitos con la anterior y llamo al metodo pasandole por parametro la NUEVA FRASE
            System.out.println("Ingrese una frase NUEVA para comparar la cantidad de digitos con la anterior: ");
            String newFrase = leer.next();
            c1.compararLongitud(newFrase);
            System.out.println("------------------------------------------------");
            
            //pido ingresar una frase nueva para unirla a la frase de la clase cadena
            System.out.println("Ingrese una frase para unirla a la frase de la clase CADENA:");
            String frase2= leer.next();
            c1.unirFrases(frase2);
            System.out.println("------------------------------------------------");
            
            //pido una letra para remplzar la "a" de la frase
            System.out.println("Ingrese un caracter para remplar las a de la frase ");
            String caracter = leer.next();
            c1.reemplazar(caracter);
            System.out.println("------------------------------------------------");
            
            //pido un caracter para ver si la frase lo contiene
            System.out.println("Ingrese que caracter quiere saber si contiene la frase");
            String caracter2 = leer.next();
            System.out.println(c1.contiene(caracter2));
    }
    
}

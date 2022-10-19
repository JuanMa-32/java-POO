/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

/**
 * un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad
jugadas máximas que puede realizar el usuario. Definir los siguientes métodos con los
parámetros que sean necesarios:
 * 
 * 
 *Constructores, tanto el vacío como el parametrizado.
• Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con
la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas, el
valor que ingresó el usuario y encontradas en 0.
• Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
• Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
• Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
• Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
• Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.
 */
public class Ahorcado {
    
    //atributos 
    private char [] buscar;
    private int encontradas;
    private int jugadasMax;

    public Ahorcado() {
    }

    public Ahorcado(char[] buscar, int encontradas, int jugadasMax) {
        this.buscar = buscar;
        this.encontradas = encontradas;
        this.jugadasMax = jugadasMax;
    }

    public char[] getBuscar() {
        return buscar;
    }

    public void setBuscar(char[] buscar) {
        this.buscar = buscar;
    }

   
  

    public int getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }

    public int getJugadasMax() {
        return jugadasMax;
    }

    public void setJugadasMax(int jugadasMax) {
        this.jugadasMax = jugadasMax;
    }
    
    Scanner leer = new Scanner (System.in,"ISO-8859-1").useDelimiter("\n");
    
    
    public void crearJuego() {

        System.out.println("ingresar la palabra");
        String palabra = leer.next();
        buscar = palabra.toCharArray();
        
        System.out.println("ingresar el maximo de jugadas");
        jugadasMax=leer.nextInt();
        encontradas=0;

    }
    
    public void longitud (){
        
        System.out.println("Longitud de la palabra: "+buscar.length);
    }
    
    
    public int buscar(char letra){
        
        int resp=0;
        
       for (int i = 0; i < buscar.length; i++) {
            if (buscar[i]==letra){
                resp++;
            } 
        }
       

       return resp;
    }
    
    
    public boolean encontradas(char letra){
    
     
         int N=buscar( letra);
         boolean enc=false;

        if (  N>0) {
            encontradas+=N;
            enc = true;

        } 

    
        return enc;
        
    }
    
    public void intentos(char letra){
        
        boolean resp= encontradas(letra);
        
        if (resp==false){
            jugadasMax--;
            
        }
        System.out.println("Oportunidades restantes: "+jugadasMax);
    }
    
    public boolean  juego(){
   
        longitud();

        System.out.println("ingresar letra a buscar");
        char letra = leer.next().charAt(0);

        int letraBuscar = buscar(letra);
        if (letraBuscar> 0) {
            System.out.println(letra + "  SE encuentra");
        } else {
            System.out.println(letra + " NO se encuentra");
        }
         intentos(letra);

        // encontradas(letra);
        int faltantes = buscar.length;
        System.out.println("Numero de letras (encontradas,faltantes)" + (encontradas) + "," + (faltantes - encontradas));

       

        System.out.println("---------------------------------------------------");

        boolean resp = false;

        if (encontradas == buscar.length) {
            resp = false;
        } else if (jugadasMax == 0) {
            resp = false;
        } else {
            resp = true;
        }

        return resp;
    }
    
}

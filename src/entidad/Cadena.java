/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 



h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
public class Cadena {
    
    //atributos
    private String frase;
    private int longitud;

    public Cadena() {
    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    //metodo para contavilizar vocales vocales
    public int mostrarVocales(){
        
        int cantidad=0;
        String letra;
        for (int i = 0; i < longitud; i++) {
            letra= frase.substring(i,i+1); 
            switch(letra){
                case "a":
                    cantidad++;
                    break;
                case "e":
                    cantidad++;
                    break;
                case "i":
                    cantidad++;
                    break;
                case "o":
                    cantidad++;
                    break;
                case "u":
                    cantidad++;
                    break;
            }
        }
        return cantidad;
    }
    
    //metodo para invertir la frase
    public void invertirFrase(){
        String letra;
        for (int i = longitud; i > 0; i--) {
            letra= frase.substring(i-1,i); 
            System.out.print(letra);
        }
        System.out.println("");
    }
    
    //metodo para contavilizar una letra ingresada por el usuario
    public int vecesRepetido(String letra){
        
        int cont =0;
        String letra2;
        for (int i = 0; i < longitud; i++) {
            letra2= frase.substring(i,i+1); 
            if (letra2.equalsIgnoreCase(letra)){
                cont++;
            }
        }
        return cont;
    }
    
    //metodo para comparar la longitud de la frase de la clase y una nueva frase
    public void compararLongitud(String frase){
        
        int largo = frase.length();
        
        if (largo>longitud){
            System.out.println("["+frase+"]"+" tine MAS digitos que "+"["+this.frase+"]");
        }else{
              System.out.println(frase+" tine MENOS digitos que "+this.frase);
        }
    }
    
    //metodo para unir la frase de la  clase cadena con una nueva frase 
    public void unirFrases(String frase){
        
        System.out.println("FRASES UNIDAS");
        System.out.println(this.frase+" "+frase);
    }
    
    //metodo para rempalazar la letra "a" por una ingresada por el usuario
    public void  reemplazar(String letra){
        
        String fraseFinal;
        String frase2;
        for (int i = 0; i < longitud; i++) {
            frase2= frase.substring(i, i+1);
            if(frase2.equals("a")){
                fraseFinal=letra;
            }else{
                fraseFinal=frase2;
            }
            System.out.print(fraseFinal);
        }
        System.out.println("");
    }
    
    //metodo para ver si la frase contiene un caracter ingresado por el usuario 
    //retorna TRUE O FALSE
    public boolean contiene(String letra){
        
        
        boolean resp= frase.contains(letra);

        return resp;
    }
}

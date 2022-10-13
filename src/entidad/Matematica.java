/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
public class Matematica {
    
    //atributos
    private double num1;
    private double num2;
    
    //constructor vacio
    public Matematica() {
    }

    //contructor con los parametros
    public Matematica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    //getter && setter
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    
    //creo este metodo para devolver el mayor de los 2 nums
    public void devolverMayor(){

        System.out.println("El mayor es: " + Math.max(num1, num2));
    }
    
    //creo este metodo para calcular la potencia del mayor numero elevado al menor numero
    public void calcularPotencia(){
  
        double redondeoN1 = Math.round(num1);
        double redondeoN2 = Math.round(num2);
        double result;

        if (redondeoN1 > redondeoN2) {
            result = Math.pow(redondeoN1, redondeoN2);
            System.out.println(redondeoN1 + " elevado a la " + redondeoN2 + " = " + result);
        } else {
            result = Math.pow(redondeoN2, redondeoN1);
            System.out.println(redondeoN2 + " elevado a la " + redondeoN1 + " = " + result);
        }


    }

    //creo este metodoo para calcular la raiz
    public void calculaRaiz(){
        
        double valorAbsolut;
        
        
        if (num1>num2){
            valorAbsolut=Math.abs(num2);
            System.out.println("La raiz cuadrada de "+valorAbsolut+" es: "+Math.sqrt(valorAbsolut));
        }else{
              valorAbsolut=Math.abs(num1);
                System.out.println("La raiz cuadrada de "+valorAbsolut+" es: "+Math.sqrt(valorAbsolut));
        }
    }
    
}

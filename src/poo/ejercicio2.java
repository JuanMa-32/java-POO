/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import Servicio.CircunferenciaServicio;
import entidad.Circunferencia;

/**
 *
 * @author NALDO
 */
public class ejercicio2 {

    /**
     * Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����).
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CircunferenciaServicio C1 = new CircunferenciaServicio();
        Circunferencia radio = C1.crearCircunferencia();
        C1.area(radio);
        C1.perimetro(radio);
        
    }
    
}

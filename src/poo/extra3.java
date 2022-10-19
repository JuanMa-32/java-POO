/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import Servicio.RaicesServicio;
import entidad.Raices;


/**
 *
 * @author NALDO
 */
public class extra3 {

    /**
     *Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes:
*/
    public static void main(String[] args) {
        // TODO code application logic here
       
        RaicesServicio rs = new RaicesServicio();
        Raices r1 = rs.ingresarDatos();
        rs.getDiscriminante(r1);
        rs.tieneRaices(r1);
        rs.tieneRaiz(r1);
        rs.obtenerRaiz(r1);
        rs.obtenerRaices(r1);
        rs.calcular(r1);
      
    }
    
}

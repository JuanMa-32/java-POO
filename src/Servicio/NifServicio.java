/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import entidad.Nif;
import java.util.Scanner;

/**
 
• Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
resultado del calculo.
• Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en
mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un método que
funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el número
de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe buscar en
un array (vector) de caracteres la posición que corresponda al resto de la división para
obtener la letra correspondiente. La tabla de caracteres es la siguiente:
 */
public class NifServicio {
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
    public Nif crearNif(){
        
        Nif n1 = new Nif();
        
        System.out.println("D.N.I :");
        n1.setDni(leer.nextLong());
        String [] vec = {"T" , "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E",};
      
        double resp = n1.getDni()%23;
        int resp2 = (int) resp;
        
        n1.setLetra(vec[resp2]);
        return n1;
    }
    
    public void mostrar(Nif n1){
        
        System.out.println(n1.getDni()+"-"+n1.getLetra());
    }
}

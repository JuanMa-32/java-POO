/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author NALDO
 */
public class DescubrirMes {
    
    private String [] meses;
    private String mesSecreto;

    public DescubrirMes() {
        meses=new String [] {"enero" ,"febrero" ,"marzo" ,"abril" ,"mayo" ,"junio" ,"julio" ,"agosto" ,"septiembre" ,"octubre" ,"noviembre" ,"diciembre"};
        mesSecreto=meses[5];
        
    }

    public DescubrirMes(String[] meses, String mesSecreto) {
        this.meses = meses;
        this.mesSecreto = mesSecreto;
    }



    public String[] getMeses() {
        return meses;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
    
    public void adivinarMes(){
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Adivine el mes secreto. Ingresar mes en minusculas");
        String mes = leer.next();
        
        while(! mes.equals(mesSecreto)) {
            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes");
            mes=leer.next();
        }
        System.out.println("¡ HA ACERTADO!");
    }
    
 
    
    
}

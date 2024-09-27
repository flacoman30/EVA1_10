/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_formulas;

import java.util.Scanner;

/**
 *
 * @author flac3
 */
public class EVA1_10_FORMULAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //DATOS
        //velocidad -----) m/s
        double VelocidadIni,tiempo,distancia,aceleracion;
        Scanner captura = new Scanner(System.in);
       
        System.out.println("velocidad inicial de objectivo");
          VelocidadIni = captura.nextDouble();
        System.out.println("tiempo en general");
          tiempo = captura.nextDouble();   //NO HAY DE AGREGARCAPTUR     
        System.out.println("aceleracion del objectivo");
        aceleracion = captura.nextDouble();
        //HAY QUE continuar con la actividad porfa c
       
    distancia= VelocidadIni * tiempo + (aceleracion * tiempo * tiempo) / 2;
      System.out.println("Distancia = "+ distancia);      
    
    
    
        
    }
    
}

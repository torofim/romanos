/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author Toro
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int I=1;
        int V=5;
        int X=10;
        int L=50;
        int C=100;
        int D=500;
        int M=1000;
        int respuesta=0;
        
        
        System.out.println("Escribe tu numero");
        Scanner datos = new Scanner(System.in);
        String entrada= datos.nextLine();
        int romano= Integer.parseInt(entrada);
        
       if(I<V){
       respuesta=romano +(V-I);
       }
       System.out.println("La respuesta es "+" "+ respuesta);
        
        
        
    }
    
    
}

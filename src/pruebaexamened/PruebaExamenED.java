/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaexamened;

import java.util.Scanner;

/**
 *
 * @author DAM110
 */
public class PruebaExamenED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        boolean salir=false;
        do{
            System.out.println("Introduce los grados que quieres pasar a kelvin: ");
            double grados=teclado.nextDouble();
        }while(salir=true);
    }
    
}

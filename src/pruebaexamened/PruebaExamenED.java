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
        boolean salir = false;
        do {
            System.out.println("Introduce los grados que quieres pasar a kelvin: ");
            double grados = teclado.nextDouble();
            double gradosk = grados * 273.15;
            System.out.println(grados + " grados Celsius son " + gradosk + " grados Kelvin");
            System.out.println("¿Quieres continuar? \nIntroduce s,S,n o N");
            char c = teclado.next().charAt(0);
            while (c != 's' && c != 'S' && c != 'n' && c != 'N') {
                System.out.println("Introduce s,S,n o N");
                c = teclado.next().charAt(0);
            }
            if (c == 'n' || c == 'N') {
                salir = true;
            }
        } while (salir == false);
    }

}

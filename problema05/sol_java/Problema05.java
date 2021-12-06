/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int X;
        int Y;
        System.out.println("Ingresar el número del eje x");
        X = entrada.nextInt();
        System.out.println("Ingresar el número del eje y");
        Y = entrada.nextInt();
        //condicionales 
        if (X > 0 && Y > 0) {
            System.out.println("Los numeros que ingresó son del Primer Cuadrante");
        } else if (X < 0 && Y > 0) { //caso contrario
            System.out.println("Los numeros que ingresó son del Segundo Cuadrante");
        } else if (X < 0 && Y < 0) {//caso contrario
            System.out.println("Los numeros que ingresó son del Cuadrante");
        } else {  //caso contrario
            System.out.println("Los numeros que ingresó son del Cuarto Cuadrante");
        }
    }
    
}

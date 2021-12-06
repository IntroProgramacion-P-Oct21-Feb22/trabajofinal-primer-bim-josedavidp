/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema07;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Problema07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int numero;
        int resultado;
        int contador = 0;
        System.out.println("Ingrese un numero par");
        numero = entrada.nextInt();
        if (numero % 2 != 0) { //Para verificar si el número es par
            System.out.println("No es numero par");
        } else {
            if (numero < 2) {
                System.out.println("Fuera de rango");
            } else {
                resultado = numero + 2;
                while (resultado <= numero) {
                    resultado = resultado + 2;

                }
                System.out.println("La suma de los términos es:" + resultado);
            }

        }
    }
    
}

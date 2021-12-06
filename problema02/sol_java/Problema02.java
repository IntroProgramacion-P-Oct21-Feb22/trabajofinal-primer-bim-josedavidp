/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
       
        Scanner entrada = new Scanner(System.in);
        int cantidad_trajes;
        double precio_traje;
        double descuento = 0;
        double subtotal = 0;
        double total = 0;
        System.out.println("Indique la cantidad de trajes");
        cantidad_trajes = entrada.nextInt();
        System.out.println("Indique el costo de los trajes ");
        precio_traje = entrada.nextDouble();
        if (cantidad_trajes == 1) {
            subtotal = cantidad_trajes*precio_traje ;
            descuento = (subtotal*20) / 100;
            total = subtotal - descuento;
        } else {
            if (cantidad_trajes == 2) {
                subtotal = cantidad_trajes*precio_traje;
                descuento = (subtotal*25) / 100;
                total = subtotal - descuento;
            } else {
                if (cantidad_trajes == 3) {
                    subtotal = cantidad_trajes*precio_traje;
                    descuento = (subtotal*40) / 100;
                    total = subtotal - descuento;
                } else {
                    if (cantidad_trajes > 3) {
                        subtotal = cantidad_trajes*precio_traje;
                        descuento = (subtotal*50) / 100;
                        total = subtotal - descuento;
                    }
                }
            }
        }
        System.out.printf(" y el total que debe cancelar por los trajes es: $%s\n" + "El subtotal es de: %.2f, " + " su descuento fue de: %.2f ",
                subtotal,
                descuento,
                total);
    }
    
}

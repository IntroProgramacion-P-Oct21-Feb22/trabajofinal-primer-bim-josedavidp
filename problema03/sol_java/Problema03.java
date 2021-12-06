/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        int tipoEmpleado;
        int horasLaboradas;
        double plazodeHora;
        double pagoExtra = 0;

        System.out.println("Colacar el nombre del empleado ");
        nombre = entrada.nextLine();

        System.out.println(": : 1 , 2 , 3 o 4) "
                + "Colacar el tipo de empleado (puede ser ");
        tipoEmpleado = entrada.nextInt();

        System.out.println("Colocar las  horas extras laboradas");
        horasLaboradas = entrada.nextInt();
        int tipoEmpjeado = 0;

        if (tipoEmpjeado == 1) {
            int plazodeHoras = (int) 1.5;
            pagoExtra = horasLaboradas * plazodeHoras;

        } else {
            if (tipoEmpleado == 2) {
                int plazodeHoras = 2;
                pagoExtra = horasLaboradas * plazodeHoras;

            } else {
                if (tipoEmpleado == 3) {
                    int plazodeHoras = (int) 2.5;
                    pagoExtra = horasLaboradas * plazodeHoras;

                } else {
                   
                    if (tipoEmpleado == 4) {
                        int plazodeHoras = 3;
                       pagoExtra = horasLaboradas * plazodeHoras;

                    }
                }
            }
        }
        Object[] pago_extra;
        System.out.printf("Pago de las horas trabajadas es: %.2f\n",
                pagoExtra);
    }
    
}

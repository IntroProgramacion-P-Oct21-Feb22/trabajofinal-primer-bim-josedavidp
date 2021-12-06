/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema001;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Problema001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        int A;
        int B;
        int C;
        String triangulo;
        
        String triangulo1 = "Triangulo rectangulo";
        String triangulo2 = "Triángulo Obtusángulo";
        String triangulo3 = "Triángulo Acutángulo";
        
        System.out.println("Ingresar valor del primer angulo");
        A = entrada.nextInt();
        
        System.out.println("Ingresar valor del segundo angulo");
        B = entrada.nextInt();
        
        System.out.println("Ingresar valor del tercer angulo");
        C = entrada.nextInt();
        
        if((A == 90) || (B == 90) || (C == 90)) {
      triangulo = triangulo1;
              
    }else{
         if(((A > 90) && (A < 180)) || ((B > 90) && (B < 180)) || ((C > 90) && (C < 180))) {
      triangulo = triangulo2;
         }else{
             triangulo =  triangulo3;
         }
         }
        System.out.printf("El resultadod de los datos es un:\n%s\n", triangulo);
    }
    

        
    }
        
        
        

        
        
        
        
        
    
    


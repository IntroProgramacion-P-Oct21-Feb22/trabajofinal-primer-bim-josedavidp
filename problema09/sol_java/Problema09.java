/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema09;

/**
 *
 * @author jose
 */
public class Problema09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int entero = 12;
        int entero1 = 11;
        int lim = 48;
        int lim1 = 44;
        String signo;
        String signosuma = "+";
        String signoresta = "-";
        String cadenaDatos = "";
        while ((entero1 <= lim1) || (entero <= lim)) {
            cadenaDatos = String.format("%s %s%d %s%d", cadenaDatos, signosuma, entero, signoresta, entero1);
            entero = entero + 12;
            entero1 = entero1 + 11;
            if ((entero1 == 11) || (entero1 % 11 == 0)){
               signo = signosuma; 
            } else {
                if  (entero % 12 == 0){
                    signo = signoresta;
                }
            }
        }
        System.out.println(cadenaDatos);
    }
    
}

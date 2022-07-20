/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo9;
import java.util.Scanner;
/**
 *
 * @author San Juan ChipSet
 */
public class Ejemplo9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero entre 0 y 10");
        numero = leer.nextInt();
        while (numero<0 || numero>10){
            System.out.println("Error ,ingrese un numero entre 0 y 10");
            numero = leer.nextInt();
        }
    }
}
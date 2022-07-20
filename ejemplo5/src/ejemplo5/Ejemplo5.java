/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo5;
 
import java.util.Scanner; //importar libreria Scanner

/**
 *
 * @author San Juan ChipSet
 */
public class Ejemplo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in); // Creamos el Scanner
        
        System.out.println("Ingrese una cadena");
        String cadena = leer.nextLine(); // Leer una cadena(se utiliza nextLine

        System.out.println("Ingrese un numero entero");
        int numEntero = leer.nextInt(); // Leer un entero
        
        System.out.println(cadena);     // Devolver por consola la cadena ingresada
        System.out.println(numEntero);  // Devolver por consola el numero ingresado
    }
    
}

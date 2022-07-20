/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo8;
import java.util.Scanner;
/**
 *
 * @author San Juan ChipSet
 */
public class Ejemplo8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        System.out.println("Ingrese una opcion");
        opcion = leer.nextInt();
        
        switch (opcion){
            case 1:System.out.println("Opcion 1");
            break;
            case 2:System.out.println("Opcion 3");
            break;
            default:System.out.println("La opcion es incorrecta");
            break;
        }
}
}

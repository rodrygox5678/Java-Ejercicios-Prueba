/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo6ejercicio;
import java.util.Scanner;
/**
 *
 * @author San Juan ChipSet
 */
public class Ejemplo6ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero1 = leer.nextInt();
        System.out.println("Ingrese un numero");
        int numero2 = leer.nextInt();
        if (numero1 > 25 ){
            System.out.println("El numero: "+numero1+" es mayor a 25");
        }else{
                System.out.println("El numero: "+numero1+ " no es mayor a 25");
                }
        
        if(numero2 > 25){
              System.out.println("El numero: "+numero2+" es mayor a 25");
        }else{
                System.out.println("El numero: "+numero2+" no es mayor a 25");
                }
        }
    }

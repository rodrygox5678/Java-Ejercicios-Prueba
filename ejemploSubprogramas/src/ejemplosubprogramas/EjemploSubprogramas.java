/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosubprogramas;
import java.util.Scanner;
/**
 *
 * @author San Juan ChipSet
 */
public class EjemploSubprogramas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1 = 5;
        int num2 = 7;
        //forma numero1
        System.out.println("La suma es: " + sumar(num1,num2));
        // se recomienda guardar la suma en una variable para despues mostrarla
        int retorno = sumar(num1,num2);
        System.out.println("La suma es(subp): "+retorno);   
    }
    public static int sumar (int num1,int num2){
    int suma;
    suma = num1 + num2;
    return suma;
    }
}

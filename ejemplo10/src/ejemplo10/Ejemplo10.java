/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.
 */
package ejemplo10;
import java.util.Scanner;

public class Ejemplo10 {

    public static void main(String[] args) {
        int numero;
        int suma = 0;
        Scanner leer = new Scanner(System.in);
       do{
          System.out.println("Escribe un numero");
            numero = leer.nextInt();
            if (numero>0){
            suma = suma + numero;
            }
       }
        while(numero != 0);{
      
    }
        System.out.println("Se capturo el numero cero");
        System.out.println("La suma es de: "+suma);      
        
    }
}
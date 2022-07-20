package ejemplo11;
import java.util.Scanner;

public class Ejemplo11 {

    public static void main(String[] args) {
        int numero1,numero2,numero3,numero4,i,j;
        Scanner leer = new Scanner(System.in);
        
           System.out.println("Ingrese un numero");
           numero1 = leer.nextInt();
            System.out.println("Ingrese un numero");
           numero2 = leer.nextInt();
            System.out.println("Ingrese un numero");
           numero3 = leer.nextInt();
            System.out.println("Ingrese un numero");
           numero4 = leer.nextInt();         
        
               for (i = 0; i < numero1; i++) {
                    System.out.print("*");
                    
            }  
               System.out.print(numero1);
                System.out.println(" ");
                
                          for (i = 0; i < numero2; i++) {
                    System.out.print("*");
                    
            }  
               System.out.print(numero2);
                System.out.println(" ");
                
                          for (i = 0; i < numero3; i++) {
                    System.out.print("*");
                    
            }  
               System.out.print(numero3);
                System.out.println(" ");
                
                          for (i = 0; i < numero4; i++) {
                    System.out.print("*");
                    
            }  
               System.out.print(numero4);
                System.out.println(" ");
          
    }
    
}
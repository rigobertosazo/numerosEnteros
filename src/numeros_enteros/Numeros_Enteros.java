
package numeros_enteros;
import java.util.Scanner;
/**
 * @author Rib
 */
public class Numeros_Enteros
{
    //Programa que lee dos numeros enteros por teclado y mostrar en pantalla:
    public static void main(String[] args) 
    {
        int num1, num2;
        Scanner s = new Scanner(System.in);
            System.out.println("** 1. Programa que lee dos numeros enteros por teclado y mostrar en pantalla**\n");
            System.out.println("Ingrese el primer numero: ");
            num1=s.nextInt();
            System.out.println("Ingrese el segundo numero: ");
            num2=s.nextInt();
        System.out.println("El primer numero ingresado es: "+num1);
        System.out.println("El primer numero ingresado es: "+num2);
    }
    
}

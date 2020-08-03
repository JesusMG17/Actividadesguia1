/* 
 * Programa que lea dos variables
 * numéricas A y B e 
 */
import java.util.*;
public class Ejercicio1 {
    public static void main(String[] args) {
    	 	
    	        Scanner teclado;
    	        int primerNumero, segundoNumero;
    	 
    	        teclado = new Scanner(System.in);
    	        System.out.print( "Introduzca el primer número: " );
    	        primerNumero = teclado.nextInt();
    	        System.out.print( "Introduzca el segundo número: " );
    	        segundoNumero = teclado.nextInt();
    	 
    	        System.out.print( "Su suma es: " );
    	        System.out.println( primerNumero+segundoNumero );
    	    }
    	}
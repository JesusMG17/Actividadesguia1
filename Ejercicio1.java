/* 
 * Programa que lea dos variables
 * num�ricas A y B e 
 */
import java.util.*;
public class Ejercicio1 {
    public static void main(String[] args) {
    	 	
    	        Scanner teclado;
    	        int primerNumero, segundoNumero;
    	 
    	        teclado = new Scanner(System.in);
    	        System.out.print( "Introduzca el primer n�mero: " );
    	        primerNumero = teclado.nextInt();
    	        System.out.print( "Introduzca el segundo n�mero: " );
    	        segundoNumero = teclado.nextInt();
    	 
    	        System.out.print( "Su suma es: " );
    	        System.out.println( primerNumero+segundoNumero );
    	    }
    	}
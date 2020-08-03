
import java.util.Scanner;


 public class Ejercicio3

 {    // Abre clase Ejercicio3
 
 public void Recibe( )
 {   // Abre metodo Recibe
 double x1;
 double y1;
 double x2;
 double y2;
 double distancia;

 Scanner entrada = new Scanner(System.in);
  
 System.out.println("\nPor favor introduzca la coordenada x del primer punto: ");
 x1 = entrada.nextDouble();
   
 System.out.println("\nPor favor introduzca la coordenada y del primer punto: ");
 y1 = entrada.nextDouble();
  
 System.out.println("\nPor favor introduzca la coordenada x del segundo punto: ");
 x2 = entrada.nextDouble();
  
 System.out.println("\nPor favor introduzca la coordenada y del segundo punto: ");
 y2 = entrada.nextDouble();

 distancia = Math.sqrt( (x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1) );

 System.out.printf("\nLa distancia entre los puntos es: %.2f\n", distancia);
     
    
 }       // Cierra metodo Recibe


 }    // Cierra clase Ejercicio3

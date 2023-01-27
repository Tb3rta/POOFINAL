package arrays;

// Crear un programa que permita introducir por línea de comandos 10
// elementos de tipo entero en un arreglo, el programa deberá mostrar
// impreso el arreglo en orden inverso.
import java.util.Scanner;
public class ejerciciosunidad3{
    public static void main(String[]args){
        int i;
        int[] numeros = new int[5];

        Scanner teclado = new Scanner(System.in);
        int n=5;
        for(i=0; i<numeros.length; i++)
        {
            System.out.printf("Introduzca número %d: ", i+1);
            numeros[i] = teclado.nextInt();
        }

        for ( i = n-1; i>-1; i--) {
            System.out.println("array vuelta: "+ numeros[i]+"\t ");
        }
        
    }
        
}

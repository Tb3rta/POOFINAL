// Realizar un programa que cree un arreglo de enteros de un tamaño pasado
// por teclado, el arreglo deberá completarse con números aleatorios.Mostrar
// en pantalla el mayor y menor de ellos.
import java.util.Scanner;
public class ejercicio4uni3{
    public static void main(String []args){
        int num2=0;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Insertar Tamaño del arreglo");
        num2= teclado.nextInt();
        int num[]= new int [num2];
        System.out.println("Tamaño elegido de: "+ num.length);
        for (int i = 0; i < num.length; i++) {
            num[i]= (int)(Math.random()*100);    
            System.out.println(" "+num[i]);        
        }
        System.out.println("Mayores y menores:");
        mayorArray(num2, num);
        menorArray(num2, num);
    }
    static void mayorArray(int mayor,int [ ]array){
        
        for (int i = 0; i < array.length; i++) {
            if (array[i]>mayor){
                mayor= array[i];
            }
        }
        System.out.println("Max: "+mayor);
    }    
    static void menorArray(int menor, int[]array){
        for (int i = 0; i < array.length; i++) {
            if (array[i]<menor){
                menor=array[i]; 
            }
        }
        System.out.println("Min: "+menor);
    }


}
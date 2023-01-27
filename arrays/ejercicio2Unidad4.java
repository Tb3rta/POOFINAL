package arrays;
// Dado un arreglo de enteros cuyos elementos son ingresados por teclado,
// mostrar en pantalla el mayor y menor de ellos.
import java.util.Scanner;

public class ejercicio2Unidad4 {
    public static void main(String []args){
        int [] array= new int [5];
        Scanner teclado= new Scanner(System.in);
        System.out.println("INGRESO NUMEROS:");
        for (int i = 0; i < array.length; i++) {
            array[i]= teclado.nextInt();
        }
        mayorArray(0, array);
 
        menorArray(5, array);
 
        sumaMenorymayor(array);
 
        reversoArray(array);
    }
    //FUNCIONESS
    static void mayorArray(int mayor , int []array){
        
        for (int i = 0; i < array.length; i++) {
            if(array[i]>mayor){
                mayor= array[i];
            }
        }
        System.out.println("El mayor es: "+ mayor);
    }
    static void menorArray(int menor,int [] array){
        for(int i = 0; i < array.length;i++){
            if(array[i]<menor){
                menor=array[i];
            }
        }
        System.out.println("Menor: "+menor);    

    }
    static void sumaMenorymayor( int []array){
        int suma=0;
        for (int i = 0; i < array.length; i++) {
            suma+=array[i];
        }
        System.out.println("Suma: "+suma);
    }
    
    static void reversoArray(int []array){
        int n=5;
        System.out.println("vuelta: ");
        for (int i = n-1; i>-1; i--) {
           System.out.println(array[i]);
        }
    }

}

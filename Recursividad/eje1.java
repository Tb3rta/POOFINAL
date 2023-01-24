package Recursividad;

import java.util.Scanner;

// Sumar los números naturales hasta N de forma
// recursiva.
public class eje1 {
    public static void main(String []args){
        int n;
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese numero Natural: ");
        n= leer.nextInt();
         sumaR(n);
        System.out.println("R: "+sumaR(n));


    }
    public static int sumaR(int numero){
        int res;
        if(numero==1){
            return 1;
        }else{
            res=numero*sumaR(numero-1);
        }
        return res;
    }
}

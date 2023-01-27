package Recursividad;

import java.util.Scanner;
//suma recursiva entre 2 vectores
public class arraydescenciente {
    public static void  main(String[]args){
        int n;
        Scanner leer = new  Scanner(System.in);
        System.out.println("Ingresar valor: ");
        n= leer.nextInt();
        int[]vec1= new int[n];

        int[] vec2= new int[n];
        for (int i = 0; i < n; i++) {
            vec1[i]=(int)(Math.random()*1000);
            vec2[i]=(int)(Math.random()*1000);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(vec1[i]+"\t");
        }
        for (int i = 0; i < n; i++) {
            System.out.println(vec2[i]+"\t");
        }            
    }
    
    static int sumaR(int []vec1, int []vec2,int n){
        if(n==0){
            return vec1[n]+vec2[n];

        }else{
            return vec1[n]+vec2[n]+sumaR(vec1, vec2, n-1);
        }

    }
}

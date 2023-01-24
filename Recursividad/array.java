package Recursividad;

public class array {
        // private static int x = 100;
        // public static class arrayb {
        //  private int y = x * 2;
    public static void main(String[]args){
        int []array = {1,5,7,4,3,2};
        mostrarArrayrecursivo(array, 5);
        }
    public static void mostrarArrayrecursivo(int []array, int indice){
        if(indice == array.length){
            
        }else{
            System.out.println(array[indice]);
            indice++;
            mostrarArrayrecursivo(array, indice++);
        }

    }
}

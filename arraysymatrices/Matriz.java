// public class Matriz{
//     public static void main(String[]args){
//         //declaro matriz
//         // int numeros[][]= new int[3][3]; //MATRIZ VACIA DE 3X3
//         int  numeros [][]= {{2,3,4},
//                             {5,6,7},
//                             {8,9,10}}; //MATRIZ RELLENA DE 3X3
//         imprimirMatriz(numeros);

//     }
//     static void imprimirMatriz(int [][]matriz){
//         for (int i = 0; i < matriz.length; i++) {
//             for (int j = 0; j < matriz.length; j++) {
//                 int numeroActual= matriz[i][j];
//                 System.out.printf("%5d",numeroActual);// %5d deja espacio entre numeros
//             }
//             System.out.println();
//         }
//     }
// }

public class Matriz{
    public static void main(String[]args){
        //declaro matriz
        // int numeros[][]= new int[3][3]; //MATRIZ VACIA DE 3X3
        int  numeros [][]= new int [3][3]; //MATRIZ RELLENA DE 3X3
        rellenarMatriz(numeros);
        imprimirMatriz(numeros);
        sumarDiagonal(numeros,"p");
        int sumaPrincipal = sumarDiagonal(numeros, "p");
        int sumaSecundaria = sumarDiagonal(numeros, "s");
        System.out.printf("La suma de la diagonal principal es %d y la de la secundaria es %d\n", sumaPrincipal, sumaSecundaria);

    }

    static void rellenarMatriz(int [][]matriz){
        for (int i = 0; i < 3; i++) {
            System.out.println();            
            for (int j = 0; j < 3; j++) {
                matriz[i][j]=j+(int)(Math.random()*100); //RELLENAR MATRIZ NUMEROS RANDOM

    }
    }
    }
    static void imprimirMatriz(int [][]matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                int numeroActual= matriz[i][j];
                System.out.printf("%5d",numeroActual);// %5d deja espacio entre numeros
            }
            System.out.println();
        }
    }

    static int sumarDiagonal(int[][] matriz, String diagonal) {
        int suma = 0;
        // Si es la principal
        if (diagonal.equals("p")) {
            int x = 0, y = 0;
            while (x < matriz.length && y < matriz[0].length) {
                suma += matriz[y][x];
                x++;
                y++;
            }
        } else {
            int x = 0, y = matriz.length - 1;
            while (x < matriz.length && y >= 0) {
                suma += matriz[y][x];
                x++;
                y--;
            }
        }
        return suma;
    }
}
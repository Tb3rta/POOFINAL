    //Dada una cadena ingresada por teclado, indicar el largo y
//cantidad de veces que aparece la letra ‘a’ en la misma.
import java.util.Scanner;
class Ejercicio4 {
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese cadena de caracteresHGo");
    String cadena = sc.nextLine();
    System.out.println("La cadena ingresada tiene " + cadena.length() + " caracteres.");
    System.out.println("La cadena ingresadatiene " + contarCar(cadena, 'a') + " letras 'a'.");
    }
		
    public static int contarCar(String s, char x) {
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == x) {
                c++;}
        }
    return c;
    }
}   
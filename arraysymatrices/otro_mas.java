
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tomas
 */
public class otro_mas {
 public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Arreglo con 1 dimension más para el String solicitado
        String[] frutas = new String[4];
        frutas[0] = "manzana";
        frutas[1] = "naranja";
        frutas[2] = "melon";

        // Variable para guardar el nombre de la fruta ingresada
        String nuevaFruta;

        // Pedir el nombre de una fruta por teclado
        System.out.println("Ingrese el nombre de una fruta: ");
        nuevaFruta = scanner.nextLine();

        // Cerrar Scanner

        // Guardar el nombre de la nueva fruta en la última posición del arreglo
        frutas[3] = nuevaFruta;

        // Imprimir arreglo
        for (String nombre : frutas) {
            System.out.println(nombre);
        }
    }
}


// Programa Java que lea una serie de valores numéricos enteros desde el teclado y los guarde en un ArrayList de tipo Integer. 
// La lectura de números enteros termina cuando se introduzca el valor -99. Este valor no se guarda en el ArrayList. 
// A continuación el programa mostrará por pantalla el número de valores que se han leído, su suma y su media.
//  Por último se mostrarán todos los valores leídos, indicando cuántos de ellos son mayores que la media.

// 1 leer valores enteros desde teclado y guarde arrailist, termina en -99(valor no se guarda)
// mostrar arraylist, suma todos y media.
// mostrar todos y cuantos son mayores que la media
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

class array2{
    public static void main(String []args){
        ArrayList <Integer> nuevoarray= leervalores();
        double suma = calculosuma(nuevoarray);
        double media = suma/nuevoarray.size();
        mostrarvalores(nue)
    }

    //pedir por teclado los valores y guardarlos en el ArrayList
   //la lectura acaba cuando se introduzca -99
    public static  ArrayList<Integer> leervalores(){
        ArrayList<Integer> valores= new ArrayList();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Termina con ingreso -99: ");
        n= sc.nextInt();
        while(n!=-99){
            valores.add(n);
            System.out.println("introduce entero, acabas -99: ");
            n= sc.nextInt();
        }
        return valores;
    }

    //recorrer el ArrayList y sumar todos sus elementos

    public static double calculosuma(ArrayList<Integer>valores){
        double suma=0;
        Iterator it= valores.iterator();
        while(it.hasNext()){
            suma= suma+(Integer)it.next();
             //next() devuelve un dato de tipo Object. Hay que convertirlo a Integer
        }
        return suma;
    }

    //mostrar todos y cuantos son mayores que la media

    public static void mostrarvalores(ArrayList<Integer> valores, double suma, double media){
        int contador=0;
        System.out.println("valores introducidos: "+ valores);
        System.out.println("Suma: "+suma);
        System.out.println("Media: "+media);
        for (Integer i: valores) {
            if(i>media)
                contador++;
            
        }
        System.out.println("valores superiores a la media: "+ contador);

    }
}

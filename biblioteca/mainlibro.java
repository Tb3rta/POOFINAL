package biblioteca;

import java.util.Scanner;

public class mainlibro {
    public static void main(String []args){

        Scanner sc= new Scanner(System.in);
        String titulo, autor;
        int ejemplares;
        //creolibros
        // Libro libro1= new Libro("josesito el cmainante","jorge",5,0);
        // Libro libro2= new Libro("josesito el cmainante","jorge",5,0);
        
        Libro libro2= new Libro();
        System.out.println("Introducir titulo");
        titulo=sc.nextLine();
        System.out.println("Introducir autor");
        autor=sc.nextLine();
        System.out.println("intrducir catidad ejemplares:");
        ejemplares=sc.nextInt();

        // //se asigna a libro2 los datos pedidos por teclado.
        // //para ello se utilizan los métodos setters
        libro2.setTitulo(titulo);
        libro2.setAutor(autor);
        libro2.setEjemplares(ejemplares);

        //muestro en pantalla
        System.out.println("Libro1 : ");
        System.out.println("Titulo: "+libro1.getTitulo());
        System.out.println("Autor: "+libro1.getAutor());
        System.out.println("Ejemplares: "+libro1.getEjemplares());
        System.out.println("Prestamos: "+libro1.getPrestamos());
        System.out.println();

        //se realiza un préstamo de libro1. El método devuelve true si se ha podido
        //realizar el préstamo y false en caso contrario

        if(libro1.devolucion()){
            System.out.println("Se devolvio libro"+ libro1.getTitulo());
        } else{
            System.out.println("No quedan ejemplares: "+libro1.getTitulo()+" para prestar.");
        }

        
        //se realiza otro préstamo de libro1. En este caso no se podrá realizar ya que
        //solo hay un ejemplar de este libro y ya está prestado. Se mostrará por
        //pantalla el mensaje No quedan ejemplares del libro…
        if (libro1.prestamos()) {
            System.out.println("Se ha prestado el libro " + libro1.getTitulo());
        } else {
            System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");         
        }
        //mostrar los datos del objeto libro1
        System.out.println("Libro 1:");
        System.out.println("Titulo: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Ejemplares: " + libro1.getEjemplares());
        System.out.println("Prestados: " + libro1.getPrestamos());
        System.out.println();

        //mostrar los datos del objeto libro2
        System.out.println("Libro 2:");
        System.out.println("Titulo: " + libro2.getTitulo());
        System.out.println("Autor: " + libro2.getAutor());
        System.out.println("Ejemplares: " + libro2.getEjemplares());
        System.out.println("Prestados: " + libro2.getPrestamos());
        System.out.println();
        

    }
}

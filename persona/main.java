
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// a) Realizar una clase que permita capturar el nombre, apellido, genero, edad,
// estas propiedades deberán ser definidas mediante el modificador de acceso Privado y
// permitir que la instancia del objeto creada pueda realizarse directamente mediante la utilización de un método constructor.
// b) Realizar un método que permita Capturar y retornar el nombre y el género de 5 personas capturadas por teclado.
// c) Realizar un método que permita retornar el promedio de las edades capturadas.
// d) Realizar un método que permita retornar la cantidad de personas con género Masculino.
// e) Realizar un método que permita retornar la cantidad de personas con género Femenino.



//size es el tamaño del conjunto o de numero de elementos presentes.
public class main {
    public static void main(String [] args){
            //capturar nombre;
            int cantidadpersonas=3;
            List<Persona1> personas = new ArrayList<>();
            // mantener la colección ordenada . 
            // Contiene los métodos basados ​​en índices para insertar, actualizar, eliminar y buscar los elementos. 
            // Puede tener los elementos duplicados también. También podemos almacenar los elementos nulos en la lista.

            for (int i = 0; i < cantidadpersonas; i++) {
                Scanner leer = new Scanner(System.in); // ingresar datos;
                System.out.println("ingresar NOMBRE: ");
                String nombre= leer.next();
                System.out.println("Apellido: ");
                String apellido= leer.next();
                System.out.println("Genero: ");
                String genero= leer.next();
                System.out.println("edad:");
                Integer edad= leer.nextInt(); 
                System.out.println(" \n ");
                Persona1 personasIngresadas= new Persona1(nombre, apellido, genero, edad); 
                //creo "personasingresadas" LUEGO en personas utilizo y agrego
                personas.add(personasIngresadas);

                
            }
                retornoNombreGenero(personas);
                promedioEdad(personas);
                cantidadMasculinos(personas);
                cantidadFemeninos(personas);
                cantidadTotalPersonas(personas);
    
    }
            //rotorno nombre y genero;
        public static void retornoNombreGenero(List<Persona1> personas){

                for (int i = 0; i < personas.size(); i++) {
                    System.out.println("Persona: "+(i+1)+" Nombre: "+personas.get(i).getNombre()+" "+personas.get(i).getApellido()+" Genero: "+personas.get(i).getGenero()+" Edad: "+personas.get(i).getEdad());                    
                }
        }

            //promedio edad
            // promedio= suma edades / total personas (5)
       public static void promedioEdad(List<Persona1> personas){
                int sumaEdad=0;
                for (int i = 0; i <personas.size(); i++) {
                    sumaEdad= sumaEdad + personas.get(i).getEdad(); 
                }
                int promedio= sumaEdad / personas.size();
                System.out.println("PROMEDIO SUMA EDAD= "+ promedio);
        }
            //RETORNO CANTIDAD MASCULINOS;

        public static void cantidadMasculinos(List<Persona1> personas){
                int sumaMasculinos=0;
                for (int i = 0; i < personas.size(); i++) {
                    if(personas.get(i).getGenero().equals("M") ||personas.get(i).getGenero().equals("Masculino")||personas.get(i).getGenero().equals("m")||personas.get(i).getGenero().equals("masculino")||personas.get(i).getGenero().equals("MASCULINO")) {
                        sumaMasculinos=sumaMasculinos+1;
                    }
                }
                System.out.println("Cantidad de Masculinos es: "+ sumaMasculinos);
        }

            //cantidad femininas
        /**
         * @param personas
         */
        public static void cantidadFemeninos(List<Persona1> personas){
                int sumaFemeninos=0;
                for (int i = 0; i < personas.size(); i++) {
                    if(personas.get(i).getGenero().equals("F")||personas.get(i).getGenero().equals("femenino")||personas.get(i).getGenero().equals("Femenino")||personas.get(i).getGenero().equals("FEMENINO")){
                        sumaFemeninos=sumaFemeninos+1;
                    }
                }
               System.out.println("Cantidad de Femeninas es: "+ sumaFemeninos);
        }
        /**
         * @param personas
         */
        public static void cantidadTotalPersonas(List<Persona1> personas){

            int total=0;
            for (int i = 0; i < personas.size(); i++) {
                total= total+ i;
                
            }
            System.out.println("Cantidad Total De Personas: "+total);
        }    
}        
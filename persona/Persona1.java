// a) Realizar una clase que permita capturar el nombre, apellido, genero, edad,
// estas propiedades deberán ser definidas mediante el modificador de acceso Privado y
// permitir que la instancia del objeto creada pueda realizarse directamente mediante la utilización de un método constructor.
// b) Realizar un método que permita Capturar y retornar el nombre y el género de 5 personas capturadas por teclado.
// c) Realizar un método que permita retornar el promedio de las edades capturadas.
// d) Realizar un método que permita retornar la cantidad de personas con género Masculino.
// e) Realizar un método que permita retornar la cantidad de personas con género Femenino.

public class Persona1{
    
        private String nombre;
        private String apellido;
        private String genero;
        private Integer edad;

        //contructor;
        public Persona1 (String nombre, String apellido, String genero, Integer edad){
            this.nombre= nombre;
            this.apellido= apellido;
            this.genero= genero;
            this.edad= edad;

        }

        // escribo los getters(permiten acceder al valor) y setters(fijan el valor del atributo.)

        public String getNombre(){
            return nombre;
        }
        public void setNombre(String nombre){
            this.nombre= nombre;
        }


        public String getApellido(){
            return apellido;

        }
        public void setApellido(String apellido){
            this.apellido=apellido;
        }
        public String getGenero(){
            return genero;
        }
        public void setGenero(String genero){
            this.genero=genero;
        }
        public Integer getEdad(){
            return edad;

        }
        public void setEdad(Integer edad){
            this.edad=edad;
        }
}
package biblioteca;
public class Libro {
    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestamos;

    public Libro(String titulo, String autor, Integer ejemplares, Integer prestamos){
        this.titulo=titulo;
        this.autor=autor;
        this.ejemplares=ejemplares;
        this.prestamos=prestamos;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public Integer getEjemplares(){
        return ejemplares;
    }
    public Integer getPrestamos(){
        return prestamos;
    }

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public void setAutor(String autor){
        this.autor=autor;
    }

    public void setEjemplares(int ejemplares){
        this.ejemplares=ejemplares;
    }
    public void setPrestados(int prestamos){
        this.prestamos=prestamos;
    }
    //calcular el incremento cada vez que realiza un prestamo.

    public boolean prestamos(){
        boolean prestado= true;
        if (prestamos < ejemplares){
            prestamos++;
        }else{
            prestado= false;
        }
        return prestado;
    }
    //metodo de devolucion de dinero 
    public boolean devolucion(){
        boolean devuelto=true;
        if (prestamos==0){
            devuelto = false;
        }else{
            prestamos--;
        }
        return devuelto;
    }
    public String toString(){
        return"titulo: "+titulo+"\nautor:"+autor+
                "\nejemplares: "+ejemplares+"\nprestados: "+prestamos;
    }
}



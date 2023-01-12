package Futbol;

public class masajista extends SeleccionFutbol {
    private String titulacion;
    private int aniosexp;
    public masajista(){
        super();
    }
    public masajista(int id, String nombre, String apellido, int edad, String titulacion, int aniosexp){
        super(id,nombre,apellido,edad);
        this.titulacion=titulacion;
        this.aniosexp=aniosexp;
    }
    public String getTitulacion(){
        return titulacion;
    
    }
    public int getAnioexp(){
        return aniosexp;
    }
    public void setTitulacion(String titulacion){
        this.titulacion=titulacion;
    }
    public void setAnioexp(int aniosexp){
        this.aniosexp=aniosexp;
    }

    public void entrenar(){
        System.out.println("da asistencia a entrenamiento cm");

    }
    public void darMasaje(){
        System.out.println("Da un Msaje");
    }
}

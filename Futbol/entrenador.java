package Futbol;
package PolimorfismoInterface;

public class entrenador extends SeleccionFutbol {
    private int idf;
    public entrenador(){
        super();
    }
    public entrenador(int id, String nombre, String apellido, int edad, int idf){
        super(id,nombre,apellido,edad);
        this.setIdf(idf);
    }
    public int getIdf(){
        return idf;

    }
    public void setIdf(int idf){
        this.idf=idf;
    }

    public void entrenar(){
        System.out.println("dirige entrenamiento");
    }

    public void jugarpartido(){
        System.out.println("dirige partido(ce)");
    }
    public void planificarEntrenamiento(){
        System.out.println("PLANIFICA ENTRENAMIENTO CE");
    }
}

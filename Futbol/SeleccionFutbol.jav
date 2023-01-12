package PolimorfismoInterface;

public abstract class SeleccionFutbol  implements IntegranteSeleccionFutbol{
    protected Integer id;
    protected String nombre;
    protected String apellido;
    protected Integer edad;

    public SeleccionFutbol(int id, String nombre, String apellido, int edad){
        this.id=id;
        this.nombre=nombre;
        this.apellido= apellido;
        this.edad=edad;
    }
    public int getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getEdad(){
        return edad;
    } 
    public void setId(int id){
        this.id=id;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }

    public void concentrarse(){
        System.out.println("Concetrarse (CLase padre)");
    }
    public void viajar(){
        System.out.println("Viajar(clase padre)");

    }
    public void entrenar(){
        System.out.println("entrenar clase pladre")
    }
    public void jugarpartido(){
        System.out.println("asise al partido de futbol clase padre")
    }


    
}
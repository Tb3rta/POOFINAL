package sobreescritura_de_metodos;
public class Personal {
    private String nombre;
    private String apellido;
    private double sueldoBase;

    private double porcentajeD;

    Personal(){
        nombre="";
        apellido="";
        sueldoBase=0.0;
        porcentajeD=0.0;
    }

    //construcotr
    Personal(String nombre, String apellido, double sueldoBase, double porcentajeD){
        this.nombre=nombre;
        this.apellido=apellido;
        this.sueldoBase=sueldoBase;
        this.porcentajeD=porcentajeD;

    }


    //geter al seter

    public double getSueldoBase(){
        return sueldoBase;
    }
    public double getPorcentajeD(){
        return porcentajeD;
    }

    public void setSueldoBase(double sueldoBase){
        this.sueldoBase=sueldoBase;

    }
    public void setPorcentajeD(double porcentajeD){
        this.porcentajeD=porcentajeD;
    }

    public double calcularSueldo(){
        return sueldoBase-(sueldoBase*porcentajeD/100);

    }

    
}

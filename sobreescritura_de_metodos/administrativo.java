package sobreescritura_de_metodos;

public class administrativo extends Personal {

    private double importeventas;
    private double porcentajeC;
    administrativo(){
        super();
        importeventas=0;
    }

    //constr

    administrativo(String nombre, String apellido,double sueldo, 
                   double descuento,double comision, double importeventas,double porcentajeC){
            super(nombre,apellido,sueldo,descuento);
            this.importeventas=importeventas;
            this.porcentajeC=porcentajeC;
    }
    public void setImporteVentas(double importe) {
        importeventas=importe;
    }

    public double calcularSueldo(){
        double sueldoSinD;
        sueldoSinD= getSueldoBase()+(importeventas*porcentajeC/100);

        return sueldoSinD-(sueldoSinD*getPorcentajeD()/100);
    }
}

    

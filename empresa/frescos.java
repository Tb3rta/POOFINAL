package empresa;

public class frescos extends productos {
    private String fecha_envasado;

    public frescos(String fecha_envasado, String fecha_V, int numero_lote){
        super(numero_lote,fecha_V);
        this.fecha_envasado=fecha_envasado;
      
    }
    public String getFecha_envasado(){
            return fecha_envasado;

    }
    public void setFecha_envasado(String fecha_envasado){
        this.fecha_envasado=fecha_envasado;
    }


    
}

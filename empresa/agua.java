package empresa;

public class agua extends congelados{
    private float salinidad;

    public agua(float salinidad, String fecha_envasado,   String fecha_V, int numero_lote,String mantenimientoTemp){
     super(fecha_envasado, fecha_V, numero_lote, mantenimientoTemp);
     this.salinidad=salinidad;
}
    public float getSalinidad(){
     return salinidad;
    }
}

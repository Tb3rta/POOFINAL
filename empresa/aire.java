package empresa;

public class aire extends congelados {
     private String composicionAire;

    public aire(String composicionAire,String fecha_envasado,   String fecha_V, int numero_lote,String mantenimientoTemp){
     super(fecha_envasado,fecha_V,numero_lote,mantenimientoTemp);
     this.composicionAire=composicionAire;
    }
    public String getComposicionAire(){
     return composicionAire;
    }
}

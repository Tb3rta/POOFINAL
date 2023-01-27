package empresa;

public class nitrogeno extends congelados {
    private String metodo;
    private int tiempo;
    public nitrogeno(String metodo, int tiempo,String fecha_envasado,   String fecha_V, int numero_lote,String mantenimientoTemp){
        super(fecha_envasado, fecha_V, numero_lote, mantenimientoTemp);
        this.metodo= metodo;
        this.tiempo=tiempo;

    }
    public String getMetodo(){
        return metodo;
    }
    public int getTiempo(){
        return tiempo;
    }
}

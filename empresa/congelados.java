package empresa;

public class congelados extends frescos {
  
  private String mantenimientoTemp;
  public congelados(String fecha_envasado,   String fecha_V, int numero_lote,String mantenimientoTemp){
    super(fecha_envasado,fecha_V,numero_lote);
    this.mantenimientoTemp=mantenimientoTemp;
  }
  public String getMantenimientoTemp(){
    return mantenimientoTemp;
  }
  public void setMantenimientoTemp(String mantenimientoTemp){
    this.mantenimientoTemp=mantenimientoTemp;
  }
        
}

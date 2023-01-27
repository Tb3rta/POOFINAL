package empresa;

public class refrigerados extends frescos{
    private int codigoO;
    private String temperaturaMant;

    public refrigerados(String fecha_envasado,   String fecha_V, int numero_lote,int codigoO, String temperaturaMant){
        super(fecha_envasado,fecha_V,numero_lote);
        this.codigoO=codigoO;
        this.temperaturaMant=temperaturaMant;

    }


    //geter an seter de codigo y temp
    public int getCodigoO(){
        return codigoO;
    }
    public void setCodigoO(int codigoO){
        this.codigoO=codigoO;
    }

    public String getTemperaturaMant(){
        return temperaturaMant;
    }
    public void  setTemperaturaMant(String temmperaturaMant) {
        this.temperaturaMant=temmperaturaMant;
    }

    
}

    


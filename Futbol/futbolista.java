package Futbol;
package PolimorfismoInterface;

public class futbolista extends SeleccionFutbol {
    private Integer dorsal;
    private String marcacion;

    public futbolista(int dorsal,String marcacion){
        this.dorsal= dorsal;
        this.marcacion=marcacion;
    }

    public int getDorsal(){
        return dorsal;
    }
    public String getMarcacion(){
        return marcacion;
    }
    public void setDorsal(int dorsal){
        this.dorsal=dorsal;
    }

    public void setMarcacion(String marcacion){
        this.marcacion=marcacion;
    }
}

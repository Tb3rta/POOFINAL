package Clases_ABSTRACT;

import fecha.fecha;

public class objetogeometrico {
     private String color;
     private boolean relleno;
     private java.util.Date fechaCreacion;
     //contrusctor
     protected objetogeometrico(){
          fechaCreacion= new java.util.Date();

     }

     public String getColor(){
          return color;

     }

     public void setColor(String color){
          this.color=color;
     }
     public boolean getRelleno(){
          return relleno;
     }
     public void setRelleno(boolean relleno){
          this.relleno=relleno;
     }    

     public java.util.Date getFechaCreacion(){
          return fechaCreacion;
     }
     public String toString(){
          return "creado el "+fechaCreacion+" \ncolor: "+color
          +" Relleno: "+relleno; 
     }

     /** Método abstracto getArea */
     public abstract double getArea();
     /** Método abstracto getPerimetro */
     public abstract double getPerimetro();
}
     
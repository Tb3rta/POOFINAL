package Clases_ABSTRACT;

abstract class animal {
     String nombre;
     int patas;
     public animal(String nombre, int patas){
          this.nombre=nombre;
          this.patas= patas;

     }
     abstract void hablar();
     // método abstracto que debe ser redefinido por las
     // subclases{
      
     
}

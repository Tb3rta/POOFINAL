package Clases_ABSTRACT;

public class perro extends animal{
     String raza;
     public perro(String nombre, int patas, String raza){
          super(nombre, patas);
          this.raza=raza;
     }
 
    public void hablar() {
          // TODO Auto-generated method stub
          System.out.println("mi nombre es:"+nombre+" Tengo"+patas+" patas"+", y"+" soy raza: " +raza);
          
     }
     
}

public class metodos {
     public class A1 {
          void llamarme() {
               System.out.println("Método llamarme dentro de A3");
          }
     }

     public class B1 extends A{
          void llamarme() {
               System.out.println("Método llamarme en B3");
          }
          }
     public class C1 extends A {
          void llamarme() {
               System.out.println("Método llamarme en C3");
          }
     }
     
     public static void main(String [] args) {
          A1 a = new A1(); // objeto tipo A3
          B1 b = new B1(); // objeto tipo B3
          C1 c = new C1(); // objeto tipo C3
          A1 r; // obtiene una referencia de tipo A3
          r = a; // r se refiere a un objeto de tipo A3
          r.llamarme(); // llamada a método llamarme de A3
          r = b; // r refiere a objeto de tipo B3
          r.llamarme(); // llama a método llamarme de la version B3
          r = c; // r refiere al objeto C
          r.llamarme(); // llama a método llamarme de la version C3
     }
     

}


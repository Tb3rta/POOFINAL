package carreras;
class Motor {
     private boolean encendido;
     private int RPM;
 
     public void encender() {
         encendido = true;
         System.out.println("El motor ha sido encendido.");
     }
 
     public void acelerar() {
         if (encendido) {
             RPM += 1000;
             System.out.println("El motor está acelerando, RPM actual: " + RPM);
         } else {
             System.out.println("El motor no está encendido, no se puede acelerar.");
         }
     }
 
     public void frenar() {
         if (encendido) {
             RPM -= 1000;
             System.out.println("El motor está frenando, RPM actual: " + RPM);
         } else {
             System.out.println("El motor no está encendido, no se puede frenar.");
         }
     }
 
     public void apagar() {
         encendido = false;
         RPM = 0;
         System.out.println("El motor ha sido apagado.");
     }
 }
package carreras;

class Automovil {
     private Motor motor;
 
     public Automovil(Motor motor) {
         this.motor = motor;
     }
 
     public void encender() {
         motor.encender();
     }
 
     public void acelerar() {
         motor.acelerar();
     }
 
     public void frenar() {
         motor.frenar();
     }
 
     public void apagar() {
         motor.apagar();
     }
 }
 
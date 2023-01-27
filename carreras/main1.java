package carreras;

public class main1 {
     public static void main(String[] args) {
          Motor motor = new Motor();
          Automovil auto = new Automovil(motor);
      
          auto.encender();
          auto.acelerar();
          auto.frenar();
          auto.apagar();
      }
}

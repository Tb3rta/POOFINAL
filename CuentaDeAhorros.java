// Cree una clase llamada CuentaDeAhorros. Use una variable static
// llamada tasaInteresAnual para almacenar la tasa de interés anual para
// todos los cuentahabientes. Cada objeto de la clase debe contener una
// variable de instancia private llamada saldoAhorros, que indique la
// cantidad que el ahorrador tiene actualmente en depósito. Proporcione
// el método calcularInteresMensual para calcular el interés mensual,
// multiplicando el saldoAhorros por la tasaInteresAnual dividida entre 12;
// este interés debe sumarse al saldoAhorros. Proporcione un método
// static llamado modificarTasaInteres para establecer la tasaInteresAnual
// en un nuevo valor. Escriba un programa para probar la clase
// CuentaDeAhorros. Cree dos instancias de objetos CuentaDeAhorros,
// ahorrador1 y ahorrador2, con saldos de $2000.00 y $3000.00,
// respectivamente. Establezca la tasaInteresAnual en 10%, después calcule
// el interés mensual e imprima los nuevos saldos para ambos
// ahorradores. Luego establezca la tasaInteresAnual en 12%, calcule el
// interés del siguiente mes e imprima los nuevos saldos para ambos
// ahorradores.


public class CuentaDeAhorros {

    private static Double  tasaInteresAnual;
    private Double  saldoAhorros;
    
    public CuentaDeAhorros(double saldoAhorros){
        this.saldoAhorros= saldoAhorros;
    }

    public void calcularInteresMensual( ){
        double interesMensual= (saldoAhorros *tasaInteresAnual ) / 12;
        saldoAhorros+=interesMensual;

    }
    public static void modificarTasaInteres(double nuevaTasa){
            tasaInteresAnual= nuevaTasa;

    } 

    public double getSaldoAhorros(){
        return saldoAhorros;
    }

    public static void main(String []args){
        CuentaDeAhorros ahorrador1 = new CuentaDeAhorros(2000);
        CuentaDeAhorros ahorrador2 = new CuentaDeAhorros(3000);


        // establece tasaInteresAnual 10%
        CuentaDeAhorros.modificarTasaInteres(0.10);    
        
        // calcular el interes mensual

        ahorrador1.calcularInteresMensual();
        ahorrador2.calcularInteresMensual();
         //imprimir saldos
        System.out.println("Intereses al 10%");
        System.out.println("Ah1: "+ ahorrador1.getSaldoAhorros());
        System.out.println("Ah2: "+ ahorrador2.getSaldoAhorros());
        System.out.println("");

        /// establezca la tasaInteresAnual en 12%, calcule el
// interés del siguiente mes e imprima los nuevos saldos para ambos
// ahorradores.
        System.out.println("Intereses al 12%");
        CuentaDeAhorros.modificarTasaInteres(0.12);
        ahorrador1.calcularInteresMensual();
        ahorrador2.calcularInteresMensual();
        System.out.println("Ah1: "+ ahorrador1.getSaldoAhorros());
        System.out.println("Ah2: "+ ahorrador2.getSaldoAhorros());

    }
}

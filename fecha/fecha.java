package fecha;

public class fecha {
    private static Integer dia;
    private Integer mes;
    private Integer anio;
    //constructor
    public fecha(int dia, int mes, int anio){
        this.dia= dia;
        this.mes=mes;
        this.anio=anio;
    }
    //geter and seter
    public static int getDia(){
        return dia; 
    }
    public int getMes(){
        return mes;
    }

    public int getAnio(){
        return anio;
    }
    public void setAnio(int anio){
        this.anio=anio;
    }
    public void setMes(int mes){
        this.mes=mes;
    }
    public void setDia(int dia){
        this.dia=dia;
    }
    //si el dia > 31
    
    public static int sumarDias( int dias) {     
        int sd=0;
        
        if(dias!=0){
            sd= dias+ dia ;
        }
        return sd;  
    }
    //metodo toString;
    public String toString(){
        String diaCad= dia+"";
        if(dia<10){
            diaCad="0"+diaCad;
        }
        String mesCad= mes+"";
        if(dia<10){
            mesCad="0"+mesCad;
        }
    
        return diaCad+"/"+mesCad+"/"+anio; 
    }

}

    // fecha(int anio){
    //     this.anio=anio;
    // }
    // public fecha(int dia, int mes, int anio) throws FechaException{
    //     this(anio); //this parametrizado solo en la primer linea.
    //     validarAnio(anio);
    //     validarDia(dia,mes,anio);
    //     this.dia=dia;
    //     validarMes(mes);
    //     this.mes=mes;
    // }
    // private void validarMes(int mes) throws FechaException{
    //     if(!(mes>0 && mes<=12)){
    //         throw  new FechaException("Mes no correcto");
    //     }
    // }
    // private void validarDia(int dia, int mes, int anio) throws FechaException{
    //         if(!(dia>=1 && dia<=numeroDias(mes,anio))){
    //                throw new FechaException("Dia no correcto");

    //         }
    // }
    // private void validarAnio(int anio)throws FechaException{
    //     if(anio<=0){
    //         throw new FechaException("año no correcto");
    //     }
    // }


    // public int numeroDias(int mes, int anio){
    //     int numDias= 0;
    //     switch(mes){
    //         case 1:
    //         case 3:
    //         case 5:
    //         case 7:
    //         case 8:
    //         case 10:
    //         case 12:
    //             numDias=31;
    //             break;
    //         case 4:
    //         case 6:
    //         case 9:
    //         case 11:
    //             numDias=30;
    //             break;
    //         case 2:
    //             numDias=28;
    //             if (esBisiesto(anio)){
    //                 numDias++;
    //             }
    //             break;
    //         default:
    //             numDias = -1;

    //     }
    //     return numDias;
    // }


    // public boolean esBisiesto(int anio){
    //     if(anio<=0){
    //         return false;
    //     }
    //     return (anio% 4== 0 && (anio % 100 !=0 || anio % 400 == 0));
    // }
    // public Date sumarRestarDiasFecha(Date fecha, int dias){        
    //     Calendar calendar = Calendar.getInstance();
    //     calendar.setTime(fecha); // Configuramos la fecha que se recibe        
    //     calendar.add(Calendar.DAY_OF_YEAR, dias);  // numero de días a añadir, o restar en caso de días<0
    //     return (Date) calendar.getTime(); // Devuelve el objeto Date con los nuevos días añadidos
    // }


package fecha;
public class UsarFecha {
    public static void main(String[]args){
       fecha f1= new fecha(1,1, 2000);
       System.out.println(f1);
       
       System.out.println(sumarDias(9));
        // try{
        //     fecha f1 = new fecha (21,4,2023);
        //     System.out.println(f1);
            

        // }catch(FechaException ex){
        //     System.out.println(ex.getMessage());
        // }
    }
}

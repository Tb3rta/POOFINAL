package empresa;

public class mainempresa {
     public static void main(String[]args){
          //crear un objeto de la clase producto
          productos p1= new productos(1, "16 de enero");
          System.out.println("p1 : - numero lote: \t "+p1.getNumero_lote()+", fecha v:  "+p1.getFecha_V());

          frescos f1 = new frescos("10 de enero", "30 enero ", 10000);
          System.out.println("congelados: "+f1.getFecha_envasado()+f1.getFecha_V()+f1.getNumero_lote());

               nitrogeno n1 = new nitrogeno("Frio", 5, "16/01/2020", "30/02/2021", 1001, "15 grados");
               System.out.println("alimetnos bajo nitrogeno : "+"metodo"+ n1.getMetodo()+"tiempo: "+n1.getTiempo()+"fecha Envasado: "+n1.getFecha_envasado()+"Fecha Venc: "+n1.getFecha_V()+"numero de lote:"+n1.getNumero_lote()+"MantenimientoTEmp: "+n1.getMantenimientoTemp() );

     }
}

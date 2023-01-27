package empresa;


// Una empresa agroalimentaria trabaja con tres tipos de productos: productos
// frescos, productos refrigerados y productos congelados. Todos los productos
// tienen fecha de vencimiento y número de lote. A su vez, los productos frescos
// deben llevar la fecha de envasado; los productos refrigerados deben llevar el
// código del organismo de supervisión alimentaria, la fecha de envasado y la
// temperatura de mantenimiento recomendada; mientras que los productos
// congelados deben llevar la fecha de envasado y la temperatura de
// mantenimiento recomendada.
// Hay tres tipos de productos congelados: congelados por aire, congelados por
// agua y congelados por nitrógeno. Los productos congelados por aire deben
// llevar la información de la composición del aire con que fue congelado. Los
// productos congelados por agua deben llevar la información de la salinidad del
// agua (gramos de sal por litro) con que se realizó la congelación. Los productos
// congelados por nitrógeno deben llevar la información del método de
// congelación empleado y del tiempo de exposición al nitrógeno expresada en
// segundos.
// Construir la jerarquía de clases, según la descripción anterior y luego
// implementarlas en Java.
public class productos {
    
    
        private String fecha_V;
        
        private Integer numero_lote;

      

        //constructor;
         productos(int numero_lote, String fecha_V){
           
            
            this.numero_lote=numero_lote;
            this.fecha_V=fecha_V;
         }

         public String getFecha_V(){
            return fecha_V;

         }
         public void setfecha_V(String fecha_V){
            this.fecha_V=fecha_V;
         }
      
         public int getNumero_lote(){
            return numero_lote;
         }
         public void setNumero_lote(int numero_lote){
            this.numero_lote=numero_lote;
         }
}

    


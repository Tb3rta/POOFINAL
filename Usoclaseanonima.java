public class Usoclaseanonima{
    class a{    
        public void Imprimir(){

        };
    }
    public void probar(){
        (new a(){
            @Override
            public void Imprimir(){
                System.out.println("clase");
            }
        }).Imprimir();
    } 
    public static void main(String []args){
        Usoclaseanonima p = new Usoclaseanonima();
        p.probar();
    }
}
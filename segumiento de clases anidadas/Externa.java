public class Externa {
    int x= 100;
    void prueba(){
        Interna interna = new Interna();
        interna.mostrar();
    }
    class Interna{
        void mostrar(){
            System.out.println("mostrar x= "+x);
        }
    }
    public class usoClaseInterna(){


}
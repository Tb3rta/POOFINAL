package sobreescritura_de_metodos;

public class UsoHerencia {
    public static void main(String []args){
        Personal p1= new Personal("Maria","Martinez",2000,15);
        administrativo a1= new administrativo("JUAN","RODRIGUEZ",1800,15,10,5000,0);
        System.out.println("Sueldo Personal1:"+p1.calcularSueldo()); 
        System.out.println("Sueldo Personal1:"+a1.calcularSueldo()); 
    }
}

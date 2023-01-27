import java.util.ArrayList;
import java.util.Iterator;
class arrailist{
    public static void main(String[]args){
    //     #definir un arraylist
    //     ArrayList<String> nombreArrayList= new ArrayList<String>();
    //     nombreArrayList.add("elemento1");
    //     nombreArrayList.add("tomas");
    //     System.out.println("cantidad:"+nombreArrayList.size());

    //     System.out.println("contains: "+nombreArrayList.contains("elemento1"));
    //     System.out.println("contains: "+nombreArrayList.lastIndexOf("elemento1"));
    //     System.out.println("contains: "+nombreArrayList.remove("elemento1"));
    //     System.out.println("contains: "+nombreArrayList);
    //     Object[] array = nombreArrayList.toArray();   
     
    
    // }
        ArrayList<String> nombreArrayList= new ArrayList<String>();
        for (int i = 0; i <=10; i++) {
            nombreArrayList.add("elemento"+i);

        }
        //anadimos elemtnos en la posicion 5 del array
        nombreArrayList.add(5,"elemento 5");

        //declaramos el iterador e imprimimos;
        // Un iterador es un objeto que nos permite recorrer una lista y presentar por pantalla todos sus elementos .
        //  Dispone de dos métodos clave para realizar esta operación hasNext() y next().
        Iterator<String> nombreIterator = nombreArrayList.iterator();


    }
}
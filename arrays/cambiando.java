package arrays;
// crear array de 100 posiciones
// contiene numeros del 1 al 100
// obtener suma todos y media
class cambiando {
    public static void main(String []args){
        int [] numeros= new int[100];
        int suma=0;
        int media;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=i+1;
            suma+=numeros[i];// sumos lo numeros que se van agregando;

        }
        System.out.println("suma: "+suma);
        media=suma/numeros.length;
        System.out.println("Media: "+media);
    }
}

public class Punto33 {
//     Frecuencia de elementos: Escribe un programa que cuente la frecuencia de
// cada elemento en un arreglo.
    public int[] frecuencia(int[] arreglo){
        int[] frecuencia = new int[arreglo.length];
        for(int i = 0; i < arreglo.length; i++){
            int contador = 0;
            for(int j = 0; j < arreglo.length; j++){
                if(arreglo[i]==arreglo[j]){
                    contador++;
                }
            }
            frecuencia[i] = contador;
        }
        return frecuencia;
    }
    
    public static void main(String[] args) {
        Punto33 p = new Punto33();
        int[] arreglo = {1,2,3,4,5,6,7,8,9,10,1,2,3,4};
        int[] frecuencia = p.frecuencia(arreglo);
        for(int i = 0; i < arreglo.length; i++){
            System.out.println("El número "+arreglo[i]+" se repite "+frecuencia[i]+" veces");
        }
    }

}

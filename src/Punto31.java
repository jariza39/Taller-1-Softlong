public class Punto31 {
//     Ordenar elementos: Implementa un algoritmo de ordenamiento (por ejemplo,
// el algoritmo de burbuja o el de selección) para ordenar un arreglo de enteros
// de manera ascendente
    public int[] ordenar(int[] arreglo){
        int aux;
        for(int i = 0; i < arreglo.length; i++){
            for(int j = 0; j < arreglo.length-1; j++){
                if(arreglo[j]>arreglo[j+1]){
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
        }
        return arreglo;
    }
    
    public static void main(String[] args) {
        Punto31 p = new Punto31();
        int[] arreglo = {10,9,8,7,6,5,4,3,2,1};
        int[] arregloOrdenado = p.ordenar(arreglo);
        System.out.println("El arreglo ordenado es: ");
        for(int i = 0; i < arregloOrdenado.length; i++){
            System.out.print(arregloOrdenado[i]+" ");
        }
    }
}

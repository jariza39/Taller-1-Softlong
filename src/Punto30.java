public class Punto30 {
//     Eliminar duplicados: Diseña un programa que elimine los elementos
// duplicados de un arreglo
    
    public int[] eliminarDuplicados(int[] arreglo){
        int[] arregloSinDuplicados = new int[arreglo.length];
        int contador = 0;
        for(int i = 0; i < arreglo.length; i++){
            boolean duplicado = false;
            for(int j = 0; j < arregloSinDuplicados.length; j++){
                if(arreglo[i]==arregloSinDuplicados[j]){
                    duplicado = true;
                }
            }
            if(!duplicado){
                arregloSinDuplicados[contador] = arreglo[i];
                contador++;
            }
        }
        int[] arregloSinDuplicadosFinal = new int[contador];
        for(int i = 0; i < contador; i++){
            arregloSinDuplicadosFinal[i] = arregloSinDuplicados[i];
        }
        return arregloSinDuplicadosFinal;
    }
    
    public static void main(String[] args) {
        Punto30 p = new Punto30();
        int[] arreglo = {1,2,3,4,5,6,7,8,9,10,1,2,3,4};
        int[] arregloSinDuplicados = p.eliminarDuplicados(arreglo);
        System.out.println("El arreglo sin duplicados es:");
        for(int i = 0; i < arregloSinDuplicados.length; i++){
            System.out.print(arregloSinDuplicados[i]+" ");
        }
    }
}

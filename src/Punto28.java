public class Punto28 {
//     Suma de elementos: Escribe un programa que calcule la suma de todos los
// elementos en un arreglo de enteros.
    public int suma(int[] arreglo){
        int suma = 0;
        for(int i = 0; i < arreglo.length; i++){
            suma += arreglo[i];
        }
        return suma;
    }
    
    public static void main(String[] args) {
        Punto28 p = new Punto28();
        int[] arreglo = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("La suma de los elementos del arreglo es: "+p.suma(arreglo));
    }

}

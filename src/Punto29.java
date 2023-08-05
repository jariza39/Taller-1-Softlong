public class Punto29 {
//     Encontrar el número más grande: Crea un programa que encuentre el número
// más grande en un arreglo de enteros
    public int mayor(int[] arreglo){
        int mayor = arreglo[0];
        for(int i = 1; i < arreglo.length; i++){
            if(arreglo[i]>mayor){
                mayor = arreglo[i];
            }
        }
        return mayor;
    }
    
    public static void main(String[] args) {
        Punto29 p = new Punto29();
        int[] arreglo = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("El número mayor del arreglo es: "+p.mayor(arreglo));
    }
}

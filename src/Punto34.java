public class Punto34 {
//     Rotación de elementos: Implementa un programa que rote los elementos de
// un arreglo hacia la izquierda o la derecha una cierta cantidad de posiciones

    public int[] rotar(int[] arreglo, int cantidad, String direccion){
        int[] arregloRotado = new int[arreglo.length];
        if(direccion.equals("izquierda")){
            for(int i = 0; i < arreglo.length; i++){
                if(i-cantidad<0){
                    arregloRotado[arreglo.length+i-cantidad] = arreglo[i];
                }else{
                    arregloRotado[i-cantidad] = arreglo[i];
                }
            }
        }else if(direccion.equals("derecha")){
            for(int i = 0; i < arreglo.length; i++){
                if(i+cantidad>arreglo.length-1){
                    arregloRotado[i+cantidad-arreglo.length] = arreglo[i];
                }else{
                    arregloRotado[i+cantidad] = arreglo[i];
                }
            }
        }
        return arregloRotado;
    }
    
    public static void main(String[] args) {
        Punto34 p = new Punto34();
        int[] arreglo = {1,2,3,4,5,6,7,8,9,10};
        int[] arregloRotado = p.rotar(arreglo, 3, "izquierda");
        System.out.println("El arreglo rotado es:");
        for(int i = 0; i < arregloRotado.length; i++){
            System.out.print(arregloRotado[i]+" ");
        }
    }
}

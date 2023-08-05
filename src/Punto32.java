public class Punto32 {
    //Buscar un elemento: Escribe un programa que busque un número específico en un arreglo y muestre su índice (o un mensaje si no se encuentra)
    public int buscar(int[] arreglo, int n){
        int indice = -1;
        for(int i=0;i<arreglo.length;i++){
            if(arreglo[i]==n){
                indice = i;
                break;
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        Punto32 p = new Punto32();
        int[] arreglo = {1,2,3,4,5,6,7,8,9,10};
        int n = 11;
        int indice = p.buscar(arreglo, n);
        if(indice!=-1){
            System.out.println("El número "+n+" se encuentra en el índice "+indice);
        }else{
            System.out.println("El número "+n+" no se encuentra en el arreglo");
        }
    }
}

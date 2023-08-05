

public class Punto10 {
//     Crea un programa que muestre los primeros 20 números de la
// serie Fibonacci. La serie Fibonacci se forma sumando los dos números
// anteriores para obtener el siguiente número: 0, 1, 1, 2, 3, 5, 8, 13, …
    public void fibonacci(){
        int n1=0;
        int n2=1;
        int n3;
        System.out.println(n1);
        System.out.println(n2);
        for(int i=0;i<18;i++){
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }
    }

    public static void main(String[] args) {
        Punto10 p = new Punto10();
        p.fibonacci();

    }
    
}

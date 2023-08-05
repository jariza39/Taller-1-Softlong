public class Punto16 {
//     Realiza un programa que calcule e imprima la serie de Fibonacci hasta un
// número dado ingresado por el usuario
    public void fibonacci(int n){
        int n1=0;
        int n2=1;
        int n3;
        System.out.println(n1);
        System.out.println(n2);
        for(int i=0;i<n-2;i++){
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }
    }

    public static void main(String[] args) {
        Punto16 p = new Punto16();
        System.out.println("Ingrese un número donde quiere que llegué la serie fibonacci:");
        int n = Integer.parseInt(System.console().readLine());
        p.fibonacci(n);
    }
    
}

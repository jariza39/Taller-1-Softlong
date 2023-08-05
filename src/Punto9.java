import java.util.Scanner;

public class Punto9 {
//     Escribe un programa que solicite al usuario un número entero positivo y
// calcule su factorial.
    public int factorial(int n){
        int factorial = 1;
        for(int i=1;i<=n;i++){
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Punto9 p = new Punto9();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero positivo:");
        int n = sc.nextInt();   
        System.out.println("El factorial de "+n+" es "+p.factorial(n));
        sc.close();
    }

    
}

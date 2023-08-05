import java.util.Scanner;

public class Punto7 {
//     Crea un programa que pida al usuario un número entero positivo y muestre
// su tabla de multiplicar hasta el 10.
    public void tabla(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+" x "+i+" = "+(n*i));
        }
    }

    public static void main(String[] args) {
        Punto7 p = new Punto7();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero positivo:");
        int n = sc.nextInt();   
        p.tabla(n);
        sc.close();
    }
    
}

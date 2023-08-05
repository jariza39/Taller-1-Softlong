import java.util.Scanner;

public class Punto5 {
// Realiza un programa que solicite al usuario dos números enteros y determine
//     cuál es el mayor de ellos.

    public String mayor(int n1, int n2){
        String respuesta;
        if(n1>n2){
            respuesta = n1+ " es mayor que "+n2;
        }else{
            respuesta = n2+ " es mayor que "+n1;
        }
        return respuesta;
    }

    public static void main(String[] args) {
        Punto5 p = new Punto5();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 2 números enteros");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(p.mayor(n1,n2));
        sc.close();
    }

}

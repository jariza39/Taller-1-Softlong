import java.util.Scanner;

public class Punto4 {
//    Pide al usuario su edad y muestra un mensaje indicando si es mayor de edad
// o menor de edad.

    public String validarEdad(int edad) {
        if (edad >= 18) {
            return "Es mayor de edad";
        } else {
            return "Es menor de edad";
        }
    }

    public static void main(String[] args) {
        Punto4 punto4 = new Punto4();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();
        System.out.println(punto4.validarEdad(edad));
        sc.close();
    }


}

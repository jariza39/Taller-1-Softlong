public class Punto8 {
//     Realiza un programa que simule un juego de adivinar un número. El
// programa debe generar un número aleatorio entre 1 y 100, y el usuario debe
// adivinarlo. El programa debe indicar si el número ingresado es mayor o
// menor que el número a adivinar.
    public static void main(String[] args) {
        int n = (int) (Math.random() * 100) + 1;
        System.out.println("Adivina el número entre 1 y 100");
        int intentos = 0;
        int numero = 0;
        while (numero != n) {
            numero = Integer.parseInt(System.console().readLine());
            if (numero > n) {
                System.out.println("El número es menor");
            } else if (numero < n) {
                System.out.println("El número es mayor");
            }
            intentos++;
        }
        System.out.println("¡Correcto! Lo lograste en " + intentos + " intentos");
    }
    
}

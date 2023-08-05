public class Punto1 {
// Realiza un programa que solicite al usuario dos números enteros y muestre
// su suma, resta, multiplicación y división.
    
   
    public void operacion(int entero1, int entero2) {
        System.out.println("La suma de los numeros es: " + (entero1 + entero2));
        System.out.println("La resta de los numeros es: " + (entero1 - entero2));
        System.out.println("La multiplicacion de los numeros es: " + (entero1 * entero2));
        System.out.println("La division de los numeros es: " + (entero1 / entero2));
    }

    public static void main(String[] args) throws Exception {
        Punto1 punto1 = new Punto1();
        System.out.println("Coloca dos numeros enteros: ");
        int entero1 = Integer.parseInt(System.console().readLine());
        int entero2 = Integer.parseInt(System.console().readLine());
        punto1.operacion(entero1, entero2);
        
    }

}

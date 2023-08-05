public class Punto15 {
    // Crea un programa que pida al usuario un número entero y determine si es un
    // número capicúa. Un número capicúa es aquel que se lee igual de izquierda a
    // derecha que de derecha a izquierda
    public boolean capicua(int n) {
        int aux = n;
        int invertido = 0;
        while (aux > 0) {
            invertido = invertido * 10 + aux % 10;
            aux /= 10;
        }
        return invertido == n;
    }

    public static void main(String[] args) {
        Punto15 p = new Punto15();
        System.out.println("Ingrese un número entero:");
        int n = Integer.parseInt(System.console().readLine());
        System.out.println(p.capicua(n) ? "Es capicua" : "No es capicua");
    }
}

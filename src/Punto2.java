public class Punto2 {
    //Escribe un programa que pida al usuario un número entero y determine si es par o impar
    public void parImpar(int entero) {
        if (entero % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }

    public static void main(String[] args) throws Exception {
        Punto2 punto2 = new Punto2();
        System.out.println("Coloca un numero entero: ");
        int entero = Integer.parseInt(System.console().readLine());
        punto2.parImpar(entero);
    }
}

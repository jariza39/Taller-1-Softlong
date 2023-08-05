public class Punto23 {
//     Crea un programa que pida al usuario una oración y muestre cuántas
// palabras contiene

    public int contarPalabras(String oracion) {
        int contador = 0;
        for (int i = 0; i < oracion.length(); i++) {
            if (oracion.charAt(i) == ' ') {
                contador++;
            }
        }
        return contador + 1;
    }

    public static void main(String[] args) {
        Punto23 p = new Punto23();
        System.out.println("Ingrese una oración:");
        String oracion = System.console().readLine();
        System.out.println("La oración tiene " + p.contarPalabras(oracion) + " palabras");
    }
}

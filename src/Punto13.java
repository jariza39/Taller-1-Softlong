public class Punto13 {
//     Pide al usuario un número decimal y muestra su valor redondeado a un
// número específico de decimales

    public double redondear(double n, int decimales) {
        return Math.round(n * Math.pow(10, decimales)) / Math.pow(10, decimales);
    }

    public static void main(String[] args) {
        Punto13 p = new Punto13();
        System.out.println("Ingrese un número decimal y el número de decimales a redondear:" );
        double n = Double.parseDouble(System.console().readLine());
        int r = Integer.parseInt(System.console().readLine());
        System.out.println(p.redondear(n, r));
    }

}

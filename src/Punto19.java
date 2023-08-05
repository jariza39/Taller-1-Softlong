public class Punto19 {
//     Escribe un programa que solicite al usuario su nombre y luego lo imprima en
// mayúsculas y minúsculas
    public String mayusculas(String nombre){
        return nombre.toUpperCase();
    }
    public String minusculas(String nombre){
        return nombre.toLowerCase();
    }
    public static void main(String[] args) {
        Punto19 p = new Punto19();
        System.out.println("Ingrese su nombre:");
        String nombre = System.console().readLine();
        System.out.println("Su nombre en mayúsculas es "+p.mayusculas(nombre));
        System.out.println("Su nombre en minúsculas es "+p.minusculas(nombre));
    }

}

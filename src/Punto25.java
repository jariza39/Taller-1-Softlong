public class Punto25 {
    // Pide al usuario una frase y muestra cada palabra por separado

    public void separar(String frase) {
        String[] palabras = frase.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }
    }

    public static void main(String[] args) {
        Punto25 p = new Punto25();
        System.out.println("Ingrese una frase:");
        String frase = System.console().readLine();
        p.separar(frase);
    }
}

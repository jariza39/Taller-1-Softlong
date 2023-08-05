public class Punto22 {
//     Escribe un programa que solicite al usuario una frase y verifique si es un
// palíndromo (se lee igual de izquierda a derecha que de derecha a izquierda)
    public boolean palindromo(String frase){
        String aux = frase.replaceAll(" ", "").toLowerCase();
        String invertida = "";
        for(int i=aux.length()-1;i>=0;i--){
            invertida += aux.charAt(i);
        }
        return aux.equals(invertida);
    }

    public static void main(String[] args) {
        Punto22 p = new Punto22();
        System.out.println("Ingrese una frase:");
        String frase = System.console().readLine();
        System.out.println(p.palindromo(frase)?"Es palíndromo":"No es palíndromo");
    }

}

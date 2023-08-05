public class Punto20 {
    //Realiza un programa que solicite al usuario una cadena y luego invierta su orden
    
    public String invertir(String cadena){
        String invertida = "";
        for(int i=cadena.length()-1;i>=0;i--){
            invertida += cadena.charAt(i);
        }
        return invertida;
    }

    public static void main(String[] args) {
        Punto20 p = new Punto20();
        System.out.println("Ingrese una cadena:");
        String cadena = System.console().readLine();
        System.out.println("La cadena invertida es "+p.invertir(cadena));
    }
}

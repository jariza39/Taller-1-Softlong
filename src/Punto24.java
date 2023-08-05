public class Punto24 {
//     Realiza un programa que solicite al usuario una cadena y reemplace todas
// las apariciones de una letra específica por otra
    public String reemplazar(String cadena, char letra1, char letra2){
        String reemplazada = "";
        for(int i=0;i<cadena.length();i++){
            if(cadena.charAt(i) == letra1){
                reemplazada += letra2;
            }else{
                reemplazada += cadena.charAt(i);
            }
        }
        return reemplazada;
    }

    public static void main(String[] args) {
        Punto24 p = new Punto24();
        System.out.println("Ingrese una cadena y dos letras:");
        String cadena = System.console().readLine();
        char letra1 = System.console().readLine().charAt(0);
        char letra2 = System.console().readLine().charAt(0);
        System.out.println("La cadena reemplazada es "+p.reemplazar(cadena, letra1, letra2));
    }
}

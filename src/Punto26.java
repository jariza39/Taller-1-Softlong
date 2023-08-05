public class Punto26 {
//     Escribe un programa que pida al usuario una cadena y muestre cuántos
// caracteres tiene sin contar los espacios en blanco
    public int contar(String cadena){
        int contador = 0;
        for(int i = 0; i < cadena.length(); i++){
            if(cadena.charAt(i) != ' '){
                contador++;
            }
        }
        return contador;
    }
    
    public static void main(String[] args) {
        Punto26 p = new Punto26();
        System.out.println("Ingrese una cadena:");
        String cadena = System.console().readLine();
        System.out.println("La cadena tiene "+p.contar(cadena)+" caracteres sin contar los espacios en blanco");
    }
}

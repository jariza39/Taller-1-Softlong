public class Punto21 {
//     Pide al usuario una cadena y muestra cuántas veces aparece una letra
// específica en ella
    
        public int contar(String cadena, char letra){
            int contador = 0;
            for(int i = 0; i < cadena.length(); i++){
                if(cadena.charAt(i) == letra){
                    contador++;
                }
            }
            return contador;
        }
        
        public static void main(String[] args) {
            Punto21 p = new Punto21();
            System.out.println("Ingrese una cadena y una letra:");
            String cadena = System.console().readLine();
            char letra = System.console().readLine().charAt(0);
            System.out.println("La letra "+letra+" aparece "+p.contar(cadena, letra)+" veces en la cadena");
        }
        
}

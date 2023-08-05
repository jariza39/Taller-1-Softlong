public class Punto27 {
//     Crea un programa que solicite al usuario una frase y luego muestre las
// palabras ordenadas alfabéticamente
    public String[] ordenar(String[] palabras){
        String aux;
        for(int i=0;i<palabras.length;i++){
            for(int j=0;j<palabras.length-1;j++){
                if(palabras[j].compareTo(palabras[j+1])>0){
                    aux = palabras[j];
                    palabras[j] = palabras[j+1];
                    palabras[j+1] = aux;
                }
            }
        }
        return palabras;
    }

    public static void main(String[] args) {
        Punto27 p = new Punto27();
        System.out.println("Ingrese una frase:");
        String frase = System.console().readLine();
        String[] palabras = frase.split(" ");
        palabras = p.ordenar(palabras);
        System.out.println("Las palabras ordenadas alfabéticamente son:");
        for(int i=0;i<palabras.length;i++){
            System.out.println(palabras[i]);
        }
    }
}

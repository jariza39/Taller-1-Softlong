public class Punto12 {
//     Realiza un programa que pida al usuario un número entero y determine si es
// un número primo o no
    public boolean esPrimo(int n){
        boolean esPrimo = true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                esPrimo = false;
                break;
            }
        }
        return esPrimo;
    }

    public static void main(String[] args) {
        Punto12 p = new Punto12();
        System.out.println("Ingrese un número entero:");
        int numero = Integer.parseInt(System.console().readLine());
        System.out.println(p.esPrimo(numero)?"Es primo":"No es primo");

    }

}

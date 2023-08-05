public class Punto17 {
//     Pide al usuario dos números enteros y muestra todos los números primos
// que se encuentran en ese rango.
        
        public boolean esPrimo(int n){
            boolean esPrimo = true;
            for(int i = 2; i < n; i++){
                if(n%i == 0){
                    esPrimo = false;
                    break;
                }
            }
            return esPrimo;
        }
        
        public void primos(int n1, int n2){
            for(int i = n1; i <= n2; i++){
                if(esPrimo(i)){
                    System.out.println(i);
                }
            }
        }
    
        public static void main(String[] args) {
            Punto17 p = new Punto17();
            System.out.println("Ingrese 2 números enteros");
            int n1 = Integer.parseInt(System.console().readLine());
            int n2 = Integer.parseInt(System.console().readLine());
            p.primos(n1, n2);
        }
}

public class Punto14 {
//     Escribe un programa que solicite al usuario un número entero positivo y
// verifique si es un número perfecto. Un número perfecto es aquel cuya suma
// de sus divisores propios (excluyendo al propio número) es igual al número

    public boolean perfecto(int n){
        int suma = 0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                suma += i;
            }
        }
        return suma==n;
    }

    public static void main(String[] args) {
        Punto14 p = new Punto14();
        System.out.println("Ingrese un número entero positivo:");
        int n = Integer.parseInt(System.console().readLine());
        System.out.println(p.perfecto(n)?"Es perfecto":"No es perfecto");
    }
}

import java.util.Scanner;

public class Punto6 {
//     Escribe un programa que pida al usuario un número y verifique si es positivo,
// negativo o cero.
    public String verificar(int n){
        String respuesta;
        if(n>0){
            respuesta = n+ " es positivo";
        }else if(n<0){
            respuesta = n+ " es negativo";
        }else{
            respuesta = n+ " es cero";
        }
        return respuesta;
    }

    public static void main(String[] args) {
        Punto6 p = new Punto6();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int n = sc.nextInt();
        System.out.println(p.verificar(n));
        sc.close();
    }


}

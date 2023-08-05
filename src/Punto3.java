import java.util.Scanner;

public class Punto3 {
    // Crea un programa que calcule y muestre el área y el perímetro de un círculo.
    // El usuario debe proporcionar el radio del círculo.
    public double areaCirculo(double radio){
        double area = Math.PI * (Math.pow(radio,2));
        double areaRedondeada = Math.round(area * 100.0) / 100.0;
        return areaRedondeada;
    }

    public double perimetroCirculo(double radio){
        double perimetro = 2 * Math.PI * radio;
        double perimetroRedondeado = Math.round(perimetro * 100.0) / 100.0;
        return perimetroRedondeado;
    }

    public static void main(String[] args) {
        Punto3 punto3 = new Punto3();
        System.out.println("Proporcione el radio del círculo:");
        Scanner sc = new Scanner(System.in);
        double radio = sc.nextDouble();
        System.out.println("El área del círculo es de: " + punto3.areaCirculo(radio));
        System.out.println("El perímetro del círculo es de: " + punto3.perimetroCirculo(radio));
        sc.close();
    }

}

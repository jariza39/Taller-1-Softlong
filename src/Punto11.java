public class Punto11 {
//     Escribe un programa que calcule el área de un triángulo utilizando la fórmula
// de Herón. El usuario debe ingresar las longitudes de los tres lados
    public double areaTriangulo(double a, double b, double c){
        double s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        double areaRedondeada = Math.round(area * 100.0) / 100.0;
        return areaRedondeada;
    }

    public static void main(String[] args) {
        Punto11 p = new Punto11();
        System.out.println("Ingrese la longitud del primer lado:");
        double a = Double.parseDouble(System.console().readLine());
        System.out.println("Ingrese la longitud del segundo lado:");
        double b = Double.parseDouble(System.console().readLine());
        System.out.println("Ingrese la longitud del tercer lado:");
        double c = Double.parseDouble(System.console().readLine());
        System.out.println("El área del triángulo es de: "+p.areaTriangulo(a, b, c));
    }
}

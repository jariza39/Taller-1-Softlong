public class Punto35 {
//     Tabla de multiplicar: Crea un programa que imprima las tablas de multiplicar
// del 1 al 10. Usa para esto una matriz
    public void tabla(){
        int[][] tabla = new int[10][10];
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                tabla[i][j] = (i+1)*(j+1);
            }
        }
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                System.out.print(tabla[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Punto35 p = new Punto35();
        p.tabla();
    }
}

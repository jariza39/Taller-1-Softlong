public class Punto18 {
//     Crea un programa que genere una contraseña aleatoria de 8 caracteres que
// contenga letras mayúsculas, letras minúsculas y dígitos. Puedes utilizar la
// clase Math para generar números aleatorios y la clase String para manipular
// la contraseña

    public static void main(String[] args) {
        String pass = "";
        for(int i=0;i<8;i++){
            int n = (int) (Math.random() * 3);
            switch(n){
                case 0:
                    pass += (char) ((int) (Math.random() * 26) + 65);
                    break;
                case 1:
                    pass += (char) ((int) (Math.random() * 26) + 97);
                    break;
                case 2:
                    pass += (int) (Math.random() * 10);
                    break;
            }
        }
        System.out.println(pass);
    }
}

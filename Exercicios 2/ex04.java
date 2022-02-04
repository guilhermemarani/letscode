import java.util.Scanner;

public class ex4 {
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);
        char[] letras = new char[4];
        int contador = 0;

        for(int x=0;x < letras.length ; x++){
            System.out.println("Digite o caracter "+(x+1));
            letras[x] = scanner.next().charAt(0);
            letras[x] = Character.toLowerCase(letras[x]);
        }

        for(char letra: letras){
            if(letra != 97 && letra != 101 && letra != 105 && letra != 111 && letra != 117){
                contador++;
                System.out.println(letra);
            }
        }
        System.out.format("Das letras digitadas, %d são consoantes",contador);
    }
}

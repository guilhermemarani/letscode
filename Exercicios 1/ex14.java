import java.util.Scanner;

public class ex14 {
        public static void main(String[] Args) {
            Scanner scanner = new Scanner(System.in);
            int indice = 1;
            int[] num = new int[20];
            int contador = 0;
            int contador2 = 0;
            int contador3 = 0;

            for (int x = 0; x < 20; x++) {
                System.out.format("Escreva o número [%d]: ", indice);
                num[x] = scanner.nextInt();
                indice++;
            }
            for (int y = 0; y < 20; y++) {
                if (num[y] >= 0 && num[y] <= 100) {
                    contador++;
                } else if (num[y] >= 101 && num[y] <= 200) {
                    contador2++;
                } else if (num[y] > 201) {
                    contador3++;
                }
            }
            System.out.format("Dos números digitados, %d estão entre 0 e 100, %d estão entre 101 e 200, e %d estão acima de 200.", contador, contador2, contador3);
        }
}

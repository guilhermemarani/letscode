import java.util.Scanner;

public class ex13 {
    public static void main(String[] Args){
        Scanner scanner =new Scanner(System.in);
        int indice = 1;
        int[] num = new int[20];
        int contador=0;

        for(int x=0; x < 20; x++) {
            System.out.format("Escreva o número [%d]: ", indice);
            num[x] = scanner.nextInt();
            indice++;
        }
        for(int y=0; y < 20; y++){
            if(num[y] > 1 && num[y] < 100){
                    contador++;
            }
        }
        System.out.format("Dos números digitados, %d estão entre 0 e 100.",contador);
    }
}

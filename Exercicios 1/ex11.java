import java.util.Scanner;

public class ex11 {
    public static void main(String[] Args){
        Scanner scanner =new Scanner(System.in);
        int indice = 1;
        int[] num = new int[20];
        int contador = 0;

        for(int x=0; x < 20; x++) {
            System.out.format("Escreva o número [%d]: ", indice);
            num[x] = scanner.nextInt();
            indice++;
        }
        for(int y=0; y < 20; y++){
            if(num[y] > 8){
                contador++;
            }
        }
        System.out.format("Dos números digitados, %d são maiores que 8",contador);
    }
}

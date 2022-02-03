import java.util.Scanner;

public class ex12 {
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
            int operador=num[y] % 2;
            if(operador == 0){
                contador++;
            }
        }
        System.out.format("Dos números digitados, %d são pares",contador);
    }
}

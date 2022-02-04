import java.util.Scanner;

public class ex9 {
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];
        int soma = 0;

        for(int x=0; x < numeros.length; x++){
            System.out.println((x+1)+" - Digite um número: ");
            numeros[x] = scanner.nextInt();

            numeros[x] *= numeros[x];
            soma += numeros[x];
        }

        System.out.println("A soma dos quadrados dos números digitados é "+soma);

    }
}

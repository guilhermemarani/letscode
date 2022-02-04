import java.util.Scanner;

/*7. Faça um Programa que leia um vetor de 5 números inteiros,
        mostre a soma, multiplicação e os números.
*/
public class ex7 {
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];
        int soma=0;
        int multiplicacao=0;

        for(int x=0; x < numeros.length; x++){
            System.out.format("Digite o %dº número: ",x+1);
            numeros[x] = scanner.nextInt();
            soma += numeros[x];
        }
        multiplicacao = numeros[0];

        for(int y=1; y < numeros.length; y++){
            multiplicacao *= numeros[y];
        }
        System.out.println("A soma dos números é: "+soma);
        System.out.println("A multiplicação dos números é: "+multiplicacao);
        for(int numero: numeros){
            System.out.println(numero);
        }

    }
}

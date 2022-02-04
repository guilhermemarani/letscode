import java.util.Random;
import java.util.Scanner;

public class ex19 {
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[3];
        int[] vetorB = new int[3];
        int[] vetorC = new int[3];

        System.out.println("Digite os valores do Vetor A: ");
        for(int x=0; x < vetorA.length; x++){
            System.out.println((x+1)+" - número: ");
            vetorA[x] = scanner.nextInt();
        }
        System.out.println("Digite os valores do Vetor B: ");
        for(int y=0; y < vetorB.length; y++){
            System.out.println((y+1)+" - número: ");
            vetorB[y] = scanner.nextInt();
        }
        System.out.println("O valor das somas dos vetores e suas posições é: ");
        for(int w=0; w < vetorC.length; w++){
            vetorC[w] = vetorA[w] + vetorB[w];
            System.out.println(vetorC[w]);
        }
    }
}

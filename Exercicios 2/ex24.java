import java.util.Scanner;

public class ex24 {
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[3];
        int[] vetorB = new int[3];
        int[] vetorC = new int[3];
        int[] vetorFinal = new int[3];

        System.out.println("Digite os valores do vetorA");
        for(int x=0; x < vetorA.length; x++){
            System.out.println((x+1)+" - Número: ");
            vetorA[x] = scanner.nextInt();
        }
        System.out.println("Digite os valores do vetorB");
        for(int x=0; x < vetorB.length; x++){
            System.out.println((x+1)+" - Número: ");
            vetorB[x] = scanner.nextInt();
        }
        for(int x=0; x < vetorC.length; x++){
            vetorC[x] = vetorA[x] - vetorB[x];
            if(vetorC[x] % 2 != 0){
                vetorFinal[x] = vetorC[x];
            }
        }
        System.out.println("Das somas dos vetores A e B, segue os que resultaram em um valor impar");
        for(int vetor : vetorFinal){
            if(vetor != 0) {
                System.out.println(vetor);
            }
        }
    }
}

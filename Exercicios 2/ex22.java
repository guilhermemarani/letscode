import java.util.Scanner;

public class ex22 {
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);

        float[] vetorA = new float[5];
        float[] vetorB = new float[5];
        float[] vetorC = new float[5];
        float[] vetorD = new float[5];

        System.out.println("Digite os números do Vetor A: ");
        for(int x=0; x < vetorA.length; x++){
            System.out.println((x+1)+" - número: ");
            vetorA[x] = scanner.nextFloat();
        }
        System.out.println("Digite os números do Vetor B: ");
        for(int x=0; x < vetorB.length; x++){
            System.out.println((x+1)+" - número: ");
            vetorB[x] = scanner.nextFloat();
        }
        System.out.println("Digite os números do Vetor C: ");
        for(int x=0; x < vetorC.length; x++){
            System.out.println((x+1)+" - número: ");
            vetorC[x] = scanner.nextFloat();
        }
        System.out.println("A soma dos vetores A,B e C é: ");
        for(int x=0; x < vetorD.length; x++){
            vetorD[x] = (vetorA[x] * vetorC[x]) / vetorB[x];
            System.out.println(vetorD[x]);
        }
    }
}

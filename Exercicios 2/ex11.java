import java.util.Scanner;

public class ex11 {
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];
        int[] vetorIntercalado = new int[30];
        int z = 0;

        for(int x=0; x < vetorA.length; x++){
            System.out.println((x+1)+" - Digite valor A: ");
            vetorA[x] = scanner.nextInt();
            System.out.println((x+1)+" - Digite valor B: ");
            vetorB[x] = scanner.nextInt();
            System.out.println((x+1)+" - Digite valor C: ");
            vetorC[x] = scanner.nextInt();
            vetorIntercalado[z] = vetorA[x];
            vetorIntercalado[z+1] = vetorB[x];
            vetorIntercalado[z+2] = vetorC[x];
            z += 3;
        }
        for (int vetorFim: vetorIntercalado){
            System.out.println(vetorFim);
        }

    }
}

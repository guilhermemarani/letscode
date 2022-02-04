/*
10. Faça um Programa que leia dois vetores com 10 elementos cada.
Gere um terceiro vetor de 20 elementos,
cujos valores deverão ser compostos pelos elementos intercalados dos dois outros vetores.
 */


import java.util.Scanner;

public class ex10 {
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorIntercalado = new int[20];
        int z = 0;

        for(int x=0; x < vetorA.length; x++){
            System.out.println((x+1)+" - Digite valor A: ");
            vetorA[x] = scanner.nextInt();
            System.out.println((x+1)+" - Digite valor B: ");
            vetorB[x] = scanner.nextInt();
            vetorIntercalado[z] = vetorA[x];
            vetorIntercalado[z+1] = vetorB[x];
            z += 2;
        }
        for (int vetorFim: vetorIntercalado){
            System.out.println(vetorFim);
        }
    }
}

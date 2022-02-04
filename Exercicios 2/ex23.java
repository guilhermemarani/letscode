/*
Elabore um algoritmo que leia os vetores A e B de números reais de 4,
calcule a média ponderada. Armazene a média em um terceiro vetor e, no final, imprima,
na ordem inversa, este terceiro vetor, com duas casas decimais. Peso A é 4 e peso B é 6.
 */

import java.util.Scanner;

public class ex23 {
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);

        float[] vetorA = new float[4];
        float[] baseVetorA = new float[4];
        float[] vetorB = new float[4];
        float[] baseVetorB = new float[4];
        float[] vetorC = new float[4];

        for(int x=0; x < vetorA.length; x++){
            System.out.println((x+1)+" Digite o valor de vetorA: ");
            vetorA[x] = scanner.nextFloat();
            baseVetorA[x] = vetorA[x] * 4;
            System.out.println((x+1)+" Digite o valor de vetorB: ");
            vetorB[x] = scanner.nextFloat();
            baseVetorB[x] = vetorB[x] * 6;

            vetorC[x] = (baseVetorA[x] + baseVetorB[x])/10;
        }
        System.out.println("A média ponderada dos vetores é: ");
        for(int x=vetorC.length-1; x >= 0; x--){
            System.out.format("%d - valor: %.2f\n",(x+1),vetorC[x]);
        }
    }
}

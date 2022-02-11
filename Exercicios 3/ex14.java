/*
    14. Fac ̧a um programa para gerar automaticamente numeros entre 0 e 99 de uma cartela de  ́
bingo. Sabendo que cada cartela devera conter 5 linhas de 5 n  ́ umeros, gere estes dados  ́
de modo a nao ter n  ̃ umeros repetidos dentro das cartelas. O programa deve exibir na  ́
tela a cartela gerada.
 */

import java.util.Random;

public class ex14 {
    public static void main(String[] Args){
        Random random = new Random();

        int[][] matriz = new int[5][5];
        int[] sorteio = new int[100];
        int sorteado = 101;

        for(int i=0; i < sorteio.length; i++){
            sorteio[i] = 101;
        }

        for(int i=0; i < matriz.length; i++){
            for(int j=0; j < matriz[i].length; j++){
                sorteado = random.nextInt(100);
                if(sorteado != sorteio[sorteado]){
                    sorteio[sorteado] = sorteado;
                    matriz[i][j] = sorteado;
                }else{
                    j -= 1; // faz com que o loop continue até que encontre um numero que não seja repetido.
                }
            }
            System.out.println();
        }
        for(int i=0; i < matriz.length; i++){
            for(int j=0; j < matriz[i].length; j++){
                System.out.printf(" %3d",matriz[i][j]);
            }
            System.out.println();
        }
    }

}

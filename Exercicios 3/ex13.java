/*
13. Gere matriz 4 x 4 com valores no intervalo [1, 20]. Escreva um programa que transforme
a matriz gerada numa matriz triangular inferior, ou seja, atribuindo zero a todos os ele-
mentos acima da diagonal principal. Imprima a matriz original e a matriz transformada.
 */

import java.util.Random;

public class ex13 {
    public static void main(String[] Args){
        Random random = new Random();

        int randomNum = 0;
        int[][] matrizNum = new int[4][4];

        for(int i=0; i < matrizNum.length; i++){
            for(int j=0; j < matrizNum[i].length; j++){
                randomNum = random.nextInt(20);
                if(randomNum > 0){
                    randomNum ++;
                    matrizNum[i][j] = randomNum;
                }
                System.out.printf(" "+matrizNum[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Matriz triangular inferior; ");
        for(int i=0; i < matrizNum.length; i++){
            for(int j=0; j < matrizNum[i].length; j++){
                if(i == 0 && j > 0){
                    matrizNum[i][j] = 0;
                }
                if(i == 1 && j > 1){
                    matrizNum[i][j] = 0;
                }
                if(i == 2 && j > 2){
                    matrizNum[i][j] = 0;
                }
                System.out.printf(" "+matrizNum[i][j]);
            }
            System.out.println();
        }
    }
}

/*
12. Leia uma matriz de 3 x 3 elementos. Calcule e imprima a sua transposta.
 */

import java.util.Random;

public class ex12 {
    public static void main(String[] Args){
        Random random = new Random();

        int[][] matrizNum = new int[3][3];
        int[][] matrizTransposta = new int [3][3];

        System.out.println("Matriz inicial:\n");
        for(int i=0;i < matrizNum.length; i++){
            for(int j=0; j < matrizNum[i].length; j++){
                matrizNum[i][j] = random.nextInt(99);
                matrizTransposta[j][i] = matrizNum[i][j];

                System.out.printf(" "+matrizNum[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Matriz transposta: \n");
        for(int i=0;i < matrizNum.length; i++){
            for(int j=0; j < matrizNum[i].length; j++){
                System.out.printf(" "+matrizTransposta[i][j]);
            }
            System.out.println();
        }
    }
}

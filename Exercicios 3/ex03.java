/*3. Faça um programa que preenche uma matriz 4 x 4 com o produto do valor da linha e da
coluna de cada elemento. Em seguida, imprima na tela a matriz.*/

import java.util.Random;

public class ex03 {
        public static void main(String[] Args){

            int[][] matriz = new int[4][4];

            for(int i=0; i < matriz.length; i++){
                for(int j=0; j < matriz[i].length; j++){
                    matriz[i][j] = i * j;
                    System.out.printf(" "+matriz[i][j]);
                }
                System.out.println();
            }
        }
}
/*6. Leia duas matrizes 4 x 4 e escreva uma terceira com os maiores valores de cada posic ̧ao ̃
das matrizes lidas.*/


import java.util.Random;

public class ex06 {
    public static void main(String[] Args){
        Random random = new Random();

        int[][] matrizA = new int[4][4];
        int[][] matrizB = new int[4][4];
        int[][] matrizC = new int[4][4];

        System.out.println("1º matriz");
        for(int i=0; i < matrizA.length; i++){
            for(int j=0; j < matrizA[i].length; j++){
                matrizA[i][j] = random.nextInt(99);
                System.out.printf(" "+matrizA[i][j]);
            }
            System.out.println();
        }

        System.out.println("\n2º matriz");
        for(int i=0; i < matrizB.length; i++){
            for(int j=0; j < matrizB[i].length; j++){
                matrizB[i][j]=random.nextInt(99);
                System.out.printf(" "+matrizB[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nJunção das 2 matrizes, onde só está levando o número maior comparado entre as mesmas posições");
        for(int i=0; i < matrizC.length; i++){
            for(int j=0; j < matrizC[i].length; j++){
                if(matrizA[i][j] > matrizB[i][j]){
                    matrizC[i][j] = matrizA[i][j];
                }else{
                    matrizC[i][j] = matrizB[i][j];
                }

                System.out.printf(" "+matrizC[i][j]);
            }
            System.out.println();
        }
    }
}

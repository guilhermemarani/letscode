import java.util.Random;

/*
10. Leia uma matriz de 3 x 3 elementos. Calcule a soma dos elementos que estao na diago-  ̃
nal principal.

 */
public class ex10 {
    public static void main(String[] Args){
        Random random = new Random();

        int[][] matrizNum = new int[3][3];
        int soma = 0;

        for(int i=0; i < matrizNum.length; i++){
            for(int j=0; j < matrizNum[i].length; j++){
                matrizNum[i][j] = random.nextInt(99);

                if(i ==0 && j == 0){
                    soma += matrizNum[i][j];
                }
                if(i == 1 && j == 1){
                    soma += matrizNum[i][j];
                }
                if(i == 2 && j == 2){
                    soma += matrizNum[i][j];
                }
                System.out.printf(" "+matrizNum[i][j]);
            }
            System.out.println();
        }
        System.out.println("A soma da diagonal principal é: "+soma);
    }
}

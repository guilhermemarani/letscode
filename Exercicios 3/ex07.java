import java.util.Random;

public class ex07 {
    public static void main(String[] Args){

        Random random = new Random();

        int[][] matrizNum = new int[10][10];

        for(int i=0; i < matrizNum.length; i++){
            for(int j=0; j < matrizNum[i].length; j++){
                if(i < j){
                    matrizNum[i][j] = 2*i + 7*j - 2;
                }else if(i == j){
                    matrizNum[i][j] = (3*((int) Math.pow(i,2))) - 1;
                }else if(i > j){
                    matrizNum[i][j] = (4*((int) Math.pow(i, 3))) - (5*((int) Math.pow(j,2))) + 1;
                }
                System.out.printf(" %5d ",matrizNum[i][j]);
            }
            System.out.println();
        }
    }
}

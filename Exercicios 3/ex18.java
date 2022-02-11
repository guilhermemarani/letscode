import java.util.Random;

public class ex18 {
    public static void main(String[] Args){
        Random random = new Random();

        int[][] matriz = new int[3][3];

        int[] somaColuna = new int[3];

        for(int i=0; i < matriz.length; i++){
            for(int j=0; j < matriz[i].length; j++){
                matriz[i][j] = random.nextInt(99);
                System.out.printf(" "+matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println("A soma das colunas é: ");
        for(int i=0; i < matriz.length; i++){
            for(int j=0; j < matriz[i].length; j++){
                somaColuna[i] += matriz[j][i];
            }
            System.out.printf(" "+somaColuna[i]);
        }
    }
}

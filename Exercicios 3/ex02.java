//2. Declare uma matriz 5 x 5. Preencha com 1 a diagonal principal e com 0 os demais elementos.
// Escreva ao final a matriz obtida.

public class ex02 {
    public static void main(String[] Args){
        int[][] num = new int[5][5];

        for(int i=0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++)
                if (i == 0 && j == 0) {
                    num[i][j] = 1;
                } else if (i == 1 && j == 1) {
                    num[i][j] = 1;
                } else if (i == 2 && j == 2) {
                    num[i][j] = 1;
                } else if (i == 3 && j == 3) {
                    num[i][j] = 1;
                } else if (i == 4 && j == 4) {
                    num[i][j] = 1;
                } else {
                    num[i][j] = 0;
                }
        }
        for(int i=0; i < num.length;i++){
            for(int j=0; j < num[i].length; j++){
                System.out.printf(" "+num[i][j]);
            }
            System.out.println();
        }
    }
}

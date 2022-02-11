import java.util.Random;

/*4. Leia uma matriz 4 x 4, imprima a matriz e retorne a localizacao (linha e a coluna) do  ̃
        maior valor.
*/
public class ex04 {
    public static void main(String[] Args){
        Random random = new Random();
        int[][] matrizNum = new int[4][4];
        int indice = 0;
        int linha = 0;
        int coluna = 0;

        for(int i=0; i < matrizNum.length; i++){
            for(int j=0; j < matrizNum[i].length; j++){
                matrizNum[i][j] = random.nextInt(99);
                System.out.printf(" "+matrizNum[i][j]);
                if(matrizNum[i][j] > indice){
                    indice = matrizNum[i][j];
                    linha = i + 1;
                    coluna = j + 1;
                }
            }
            System.out.println();
        }
        System.out.println("\nO maior número da Matriz é : "+indice);
        System.out.println("Linha: "+linha);
        System.out.println("Coluna: "+coluna);
    }
}

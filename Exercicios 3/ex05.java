import java.util.Random;
import java.util.Scanner;

/*5. Leia uma matriz 5 x 5. Leia tambem um valor  ́ X. O programa devera fazer uma busca  ́
desse valor na matriz e, ao final, escrever a localizac ̧ao (linha e coluna) ou uma mensa-  ̃
gem de “nao encontrado”.
*/
public class ex05 {
    public static void main(String[] Args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[][] matrizNum = new int[5][5];
        int numX = 0;
        int linha = 0;
        int coluna = 0;
        int comparacao = 0;

        for(int i=0; i < matrizNum.length; i++){
            for(int j=0; j < matrizNum[i].length; j++) {
                matrizNum[i][j] = random.nextInt(99);
                System.out.printf(" "+matrizNum[i][j]);
            }
            System.out.println();
        }
        System.out.println("\nDigite um número, vou localizar linha e coluna se ele existir na matriz acima");
        numX = scanner.nextInt();

        for(int i=0; i < matrizNum.length; i++){
            for(int j=0; j < matrizNum[i].length; j++){
                if(numX == matrizNum[i][j]){
                    linha = i + 1;
                    coluna = j + 1;
                    comparacao++;
                }
            }
        }

        if(comparacao > 0){
            System.out.printf("\nO número %d, está localizado na linha %d e coluna %d\n",numX,linha,coluna);
        }else{
            System.out.println("Número não encontrado");
        }


    }

}

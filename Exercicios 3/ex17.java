import java.util.Random;

public class ex17 {
    public static void main(String[] Args){
        Random random = new Random();

        int[][] matrizNum = new int[3][10];
        int[] menorNota = new int[10];
        int[] prova = new int[10];
        int[] acumuladoProva = {0,0,0};

        for(int i=0; i < menorNota.length; i++){
            menorNota[i] = 11;
        }
        for(int i=0; i < matrizNum.length; i++){
            for(int j=0; j < matrizNum[i].length; j++){
                matrizNum[i][j] = random.nextInt(11);
                System.out.printf(" %2d",matrizNum[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0; i < 10; i++){
            for(int j=0; j < 3; j++){

                if(matrizNum[j][i] < menorNota[i]){
                    menorNota[i] = matrizNum[j][i];
                    prova[i] = j;
                }
            }
            System.out.printf(" %2d",menorNota[i]);
        }
        System.out.println();
        for(int i=0; i < prova.length; i++){
            if(prova[i] == 0){
                acumuladoProva[0]++;
            }
            if(prova[i] == 1){
                acumuladoProva[1]++;
            }
            if(prova[i] == 2){
                acumuladoProva[2]++;
            }
        }

        for(int i=0; i < acumuladoProva.length; i++){
            System.out.printf("\nQuantidade piores notas prova %d: %d",i+1,acumuladoProva[i]);
        }
    }
}

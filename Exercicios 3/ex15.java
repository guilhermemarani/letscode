import java.util.Random;

public class ex15 {
    public static void main(String[] Args){
        Random random = new Random();

        int[][] matrizAluno = new int[5][10];
        String[][] matrizConvertida =new String[5][10];
        int[] vetorGabarito = new int[10];
        String[] vetorConvertido = new String[10];
        int[] notaAluno = {0,0,0,0,0};

        for(int i=0; i < matrizAluno.length; i++){
            for(int j=0; j < matrizAluno[i].length; j++){
                matrizAluno[i][j] = 97 + random.nextInt(100-97+1); //Limitando os valores entre 97 e 100

                matrizConvertida[i][j] = Character.toString((char)matrizAluno[i][j]);
                System.out.printf(" "+matrizConvertida[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0; i < vetorGabarito.length; i++){
            vetorGabarito[i] = 97 + random.nextInt(100-97+1);
            vetorConvertido[i] = Character.toString((char)vetorGabarito[i]);
            System.out.printf(" "+vetorConvertido[i]);
        }
        System.out.println();
        for(int i=0; i < matrizConvertida.length; i++){
            for(int j=0; j < matrizConvertida[i].length; j++){
                if(i == 0){
                    if(matrizConvertida[i][j].equals(vetorConvertido[j])){
                        notaAluno[i]++;
                    }
                }
                if(i == 1){
                    if(matrizConvertida[i][j].equals(vetorConvertido[j])){
                        notaAluno[i]++;
                    }
                }
                if(i == 2){
                    if(matrizConvertida[i][j].equals(vetorConvertido[j])){
                        notaAluno[i]++;
                    }
                }
                if(i == 3){
                    if(matrizConvertida[i][j].equals(vetorConvertido[j])){
                        notaAluno[i]++;
                    }
                }
                if(i == 4){
                    if(matrizConvertida[i][j].equals(vetorConvertido[j])){
                        notaAluno[i]++;
                    }
                }
            }
        }
        for(int i=0; i < notaAluno.length; i++){
            System.out.printf("\nNota aluno %d: %d",i+1,notaAluno[i]);
        }
    }
}

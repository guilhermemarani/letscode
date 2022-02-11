import java.util.Random;
import java.util.Scanner;

public class ex16 {
    public static void main(String[] Args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[][] matrizAluno = new int[3][11];
        String[][] matrizConvertida =new String[3][11];
        int[] vetorGabarito = new int[10];
        String[] vetorConvertido = new String[11];
        int[] notaAluno = {0,0,0};

        System.out.println("Digite a matricula dos 3 participantes da prova: ");
        System.out.printf("\nAluno 1: ");
        matrizAluno[0][0] = scanner.nextInt();
        System.out.printf("\nAluno 2: ");
        matrizAluno[1][0] = scanner.nextInt();
        System.out.printf("\nAluno 3: ");
        matrizAluno[2][0] = scanner.nextInt();

        for(int i=0; i < matrizAluno.length; i++){
            for(int j=1; j < matrizAluno[i].length; j++){
                matrizAluno[i][j] = 97 + random.nextInt(101-97+1); //Limitando os valores entre 97 e 101

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
            for(int j=1; j < matrizConvertida[i].length; j++){
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
            }
        }
        System.out.println();
        for(int i=0; i < matrizConvertida.length; i++){
            System.out.printf("| "+matrizAluno[i][0]);
            for(int j=1; j < matrizConvertida[i].length; j++){
                System.out.printf("| "+matrizConvertida[i][j]);
            }
            System.out.printf("| "+notaAluno[i]);
            if(notaAluno[i] > 7){
                System.out.printf("| Aprovado");
            }else{
                System.out.printf("| Reprovado");
            }
            System.out.println();
        }
    }
}

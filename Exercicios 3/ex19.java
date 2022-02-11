import java.util.Random;
import java.util.Scanner;

public class ex19 {
    public static void main(String[] Args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[][] matrizAluno = new int[5][4];
        int[] randomIndice = {99999,11,11,11};
        int[] alunoInfo = new int[4];
        int pesquisa = 0;
        int soma = 0;
        int indiceMaior = 0;
        int matriculaMaior = 0;
        int somaMedia = 0;

        System.out.println();
        System.out.printf("Matricula|  MediaPV|  MediaTB|  NotaFim|");
        System.out.println();

        for(int i=0; i < matrizAluno.length; i++){
            for(int j=0; j < matrizAluno[i].length-1; j++){
                matrizAluno[i][j] = random.nextInt(randomIndice[j]);
            }
        }

        for(int i=0; i < matrizAluno.length; i++){
            for(int j=1; j < matrizAluno[i].length-1; j++){
                matrizAluno[i][3] += matrizAluno[i][j];
            }
            matrizAluno[i][3] = matrizAluno[i][3] / 2 ;

        }
        for(int i=0; i < matrizAluno.length; i++){
            for(int j=0; j < matrizAluno[i].length; j++){
                System.out.printf(" %8d|",matrizAluno[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Digite a matricula do aluno que quer validar as informações: ");

        pesquisa = scanner.nextInt();

        for(int i=0; i < matrizAluno.length; i++){
            for(int j=0; j < matrizAluno[i].length; j++){
                if(pesquisa == matrizAluno[i][j]){
                    System.out.printf("Matricula|  MediaPV|  MediaTB|  NotaFim|");
                    System.out.println();
                    for(int x=0; x < matrizAluno[i].length; x++){
                        System.out.printf(" %8d|",matrizAluno[i][x]);
                    }
                }
            }
        }

        for(int i=0; i < matrizAluno.length; i++){
            somaMedia += matrizAluno[i][3];
            if(matrizAluno[i][3] > indiceMaior){
                indiceMaior = matrizAluno[i][3];
                matriculaMaior = i;
            }
        }
        System.out.println();

        System.out.printf("Aluno de matricula %d com maior nota final: %d",matrizAluno[matriculaMaior][0], indiceMaior);
        System.out.println("\n Média aritmética das notas finais: "+somaMedia / 5);
    }
}

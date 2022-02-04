/*6. Faça um Programa que peça as quatro notas de 10 alunos,
calcule e armazene num vetor a média de cada aluno,
imprima o número de alunos com média maior ou igual a 7.0.
 */

import java.util.Scanner;

public class ex6 {
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);

        float[] alunos = new float[4];
        float[] notasAlunos = new float[4];
        int contador=0;

        for(int x=0; x < alunos.length; x++){
            System.out.format("Digite as notas do aluno [%d]: \n",x+1);
                for(int y=0; y < notasAlunos.length; y++){
                    System.out.format("Nota [%d]: ",y+1);
                    notasAlunos[y] = scanner.nextFloat();
                }

                float soma =0;
                float media =0;

                for(float notaAluno: notasAlunos){
                    soma +=notaAluno;
                }
                media = soma / 4;

                alunos[x] = media;
        }
        for(float aluno: alunos){
            if(aluno >= 7.0){
                contador++;
            }
        }

        System.out.println(contador+" Alunos foram aprovados!");
    }
}

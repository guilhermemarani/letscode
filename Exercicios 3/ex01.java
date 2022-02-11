//1. Leia uma matriz 4 x 4, conte e escreva quantos valores maiores que 10 ela possui.

import java.util.Random;

public class ex01 {

    public static void main(String[] Args){
        Random random = new Random();

        int[][] num = new int[4][4];

        System.out.println("Números gerados no Random: ");
        for(int i=0; i < num.length; i++){
            for(int j=0; j < num[i].length; j++){
                num[i][j] = random.nextInt(100);
                System.out.printf(" "+num[i][j]);
            }
        }
        System.out.println("\n\nNúmeros maiores que 10: ");
        for(int i=0; i < num.length; i++){
            for(int j=0; j < num[i].length; j++){
                if(num[i][j] > 10){
                    System.out.printf(" "+num[i][j]);
                }
            }
        }
    }
}

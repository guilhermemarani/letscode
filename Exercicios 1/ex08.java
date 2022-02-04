import java.util.Scanner;

public class ex8 {
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);

        int[] num = new int[20];

        int padrao=1;
        int quantidade=20;
        int maioridade=0;
        int menoridade=0;

        for(int x=0; x <quantidade; x++){
            System.out.format("Digite idade [%d]:",padrao);
            num[x] = scanner.nextInt();
            padrao++;
            if(num[x]>=18){
                maioridade++;
            }else{
                menoridade++;
            }
        }

        System.out.format("Das idades digitas, %d são maiores e %d são menores de idade.",maioridade,menoridade);

    }
}

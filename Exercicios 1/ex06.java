import java.util.Scanner;

public class ex6 {

    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);

        int[] num = new int[40];

        int padrao=1;

        for(int x=0; x <20; x++){
            System.out.format("Digite idade [%d]:",padrao);
            num[x] = scanner.nextInt();
            padrao++;
        }

        int w=0;
        int z=1;
        int soma=0;
        int resultado=0;

        for(int y=0; y <20; y++){

            soma = num[w] + num[z];

            w = w + 2;
            z = z + 2;

            resultado = soma + resultado;
        }

        System.out.println("A soma das idades é: "+resultado);

    }

}

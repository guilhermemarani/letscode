import java.util.Scanner;

/*
8. Faça um Programa que peça a idade e a altura de 5 pessoas,
armazene cada informação no seu respectivo vetor.
Imprima a idade e a altura na ordem inversa a ordem lida.
*/
public class ex8 {
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);

        int[] idade = new int[5];
        float[] altura = new float[5];

        for(int x=0; x < idade.length; x++){
            System.out.println((x+1)+" - Qual sua idade: ");
            idade[x] = scanner.nextInt();
            System.out.println((x+1)+" - Qual sua altura: ");
            altura[x] = scanner.nextFloat();
        }
        System.out.println("teste");
        for(int y=idade.length-1;y >=0 ; y--){
            System.out.println((y+1)+" - Idade: "+idade[y]);
            System.out.println((y+1)+" - Altura: "+altura[y]);
        }

    }
}

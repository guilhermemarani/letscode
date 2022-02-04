import java.util.Scanner;

public class ex3 {
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);

        int[] notas = new int[4];

        for(int x=0; x < notas.length; x++){
            System.out.println("Digite a nota nº "+(x+1));
            notas[x] = scanner.nextInt();
        }

        int soma=0;

        for(int nota: notas){
            soma += nota;
            System.out.println("Nota depois da soma: "+soma);

        }

        soma /= 4;
        System.out.println("A média das notas é "+soma);
    }
}

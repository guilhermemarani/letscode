import java.util.Scanner;

public class ex4 {

    public static void main (String[] Args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Quantas vezes?");
        int multiplicador = scanner.nextInt();

        for(int x=1; x <=multiplicador; x++){
            System.out.format("%s [%d]\n",nome,x);
        }
    }
}

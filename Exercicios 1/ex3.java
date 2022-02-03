import java.util.Scanner;

public class ex3 {
    public static void main(String[] Args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual seu nome: ");
        String nome = scanner.nextLine();

        for(int x=1; x <=10; x++){
            System.out.format("%s [%d]\n",nome,x);
        }
    }
}

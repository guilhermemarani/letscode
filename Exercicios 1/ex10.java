import java.util.Scanner;

public class ex10 {
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);
        int total;

        System.out.println("Qual número quer utilizar para tabuada?");
        int multiplicador = scanner.nextInt();

        for(int x=1; x <= 10; x++){
            total=0;

            total = multiplicador * x;
            System.out.format("%d x %d = %d\n",multiplicador,x,total);

        }


    }
}

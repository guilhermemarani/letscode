import java.util.Scanner;

public class ex2 {
    public static void main(String[] args){
        int[] numeros = new int[10];
        Scanner scanner = new Scanner(System.in);

        for(int i=0; i < numeros.length; i++){
            numeros[i] = scanner.nextInt();
        }

        for(int i=numeros.length-1; i >= 0; i--){
            System.out.println(numeros[i]);
        }
    }
}

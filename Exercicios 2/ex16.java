import java.util.Scanner;

public class ex16 {
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        for(int x=0; x < numeros.length; x++){
            System.out.println((x+1)+" - Digite o número: ");
            numeros[x] = scanner.nextInt();
        }
        for(int x=numeros.length-1; x >=0; x--){
            System.out.println((x+1)+"º digitado: "+numeros[x]);
        }
    }
}

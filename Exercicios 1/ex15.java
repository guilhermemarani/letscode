import java.util.Scanner;

public class ex15 {
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);

        int[] num = new int[100];
        int soma=0;

        //Podemos optar por for(;numero >= 0;){}
        for(int x=1;x > 0;x++){
            System.out.println("Digite um numero: ");
            num[x] = scanner.nextInt();
            if(num[x] < 0){
                x = -1;
            }else{
                soma += num[x];
            }
        }
            if(soma <= 0){
                System.out.println("Looping finalizado, não houve soma");
            }else {
                System.out.println("A soma dos números é: " + soma);
            }
    }
}

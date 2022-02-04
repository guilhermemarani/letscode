import java.util.Scanner;

public class ex1 {
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];
        for(int i=0; i < numeros.length; i++){
            System.out.println(i+ " - Digite um numero");
            numeros[i]=scanner.nextInt();
        }
        //foreach
        for(int numero: numeros){ //Aqui o numero vai percorrer todos os campos dentro do array numeros
            System.out.println("Numero digitado: "+numero);
        }
    }
}

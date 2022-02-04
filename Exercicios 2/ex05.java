import java.util.Scanner;

public class ex5 {
    public static void main(String[] Args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetoresDigitados = new int[5];
        int[] vetoresPares = new int[5];
        int[] vetoresImpares = new int[5];

        for (int x = 0; x < vetoresDigitados.length ; x++){
            System.out.println("Escreva o número "+(x+1));
            vetoresDigitados[x]=scanner.nextInt();
            if(vetoresDigitados[x] % 2 == 1){
                    vetoresImpares[x] = vetoresDigitados[x];
            }else {
                vetoresPares[x] = vetoresDigitados[x];
            }
        }
        System.out.println("Numeros digitados: ");
        for(int vetorDigitado: vetoresDigitados){
                System.out.println(vetorDigitado);
        }
        System.out.println("Números pares: ");
        for(int vetorPar: vetoresPares){
            if(vetorPar != 0) {
                System.out.println(vetorPar);
            }
        }
        System.out.println("Números Impares: ");
        for (int vetorImpar:vetoresImpares){
            if(vetorImpar != 0) {
                System.out.println(vetorImpar);
            }
        }
    }
}

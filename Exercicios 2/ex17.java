import java.util.Random;

public class ex17 {
    public static void main(String[] Args){
        Random random = new Random();
        int[] numeros = new int[15];
        int numMaior = 0;
        int numMenor = 0;
        int posicaoMaior = 0;
        int posicaoMenor = 0;
        int condicaoMenor = 0;

        for(int x=0; x < numeros.length; x++) {
            numeros[x] = random.nextInt(999);

            if (numeros[x] > numMaior) {
                numMaior = numeros[x];
                posicaoMaior = x;
            }
            System.out.println(numeros[x]);
        }
        condicaoMenor = numMaior;
        for(int y=0; y < numeros.length; y++){
            if(numeros[y] < condicaoMenor){
                numMenor = numeros[y];
                posicaoMenor = y;
                condicaoMenor = numeros[y];
            }
        }
        System.out.format("O maior número é o %d e está na posição %d \n", numMaior, posicaoMaior);
        System.out.format("O menor número é o %d e está na posição %d \n", numMenor, posicaoMenor);
    }
}

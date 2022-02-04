import java.util.Random;

public class ex18 {
    public static void main(String[] Args){
        Random random = new Random();
        int[] numeros = new int[30];
        int numMaior = 0;

        for(int x=0; x < numeros.length; x++){
            numeros[x] = random.nextInt(999);
            if(numeros[x] > numMaior){
                numMaior = numeros[x];
            }
        }

        System.out.println("O Maior número é: "+numMaior);

    }
}

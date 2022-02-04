import java.util.Random;

public class ex20 {
    public static void main(String[] Args){
        Random random = new Random();

        int[] jogadores  = new int[12];
        float[] alturaJogadores = new float[12];
        float minAltura = 1.70f;
        float maxAltura = 2.30f;
        float maiorAltura = 0f;
        int maiorJogador = 0;

        for(int x=0; x < jogadores.length; x++){
            jogadores[x] = random.nextInt(99);
            alturaJogadores[x] = minAltura + random.nextFloat() * (maxAltura - minAltura);

            System.out.format("Jogador de número %d, mede %.2f\n",jogadores[x], alturaJogadores[x]);

            if(alturaJogadores[x] > maiorAltura) {
                maiorAltura = alturaJogadores[x];
                maiorJogador = jogadores[x];
            }
        }
        System.out.format("\nO Jogador de número %d é o mais alto e mede %.2f\n",maiorJogador,maiorAltura);
    }
}

import java.util.Random;

public class ex21 {
    public static void main(String[] Args){
        Random random = new Random();

        int[] jogadores  = new int[12];
        float[] alturaJogadores = new float[12];
        float minAltura = 1.70f;
        float maxAltura = 2.30f;
        float mediaAltura = 0f;

        for(int x=0; x < jogadores.length; x++){
            jogadores[x] = random.nextInt(99);
            alturaJogadores[x] = minAltura + random.nextFloat() * (maxAltura - minAltura);

            System.out.format("Jogador de número %d, mede %.2f\n",jogadores[x], alturaJogadores[x]);

            mediaAltura += alturaJogadores[x];

        }

        mediaAltura /= 12;

        System.out.format("\nA média de altura do time é %.2f\n",mediaAltura);
    }
}

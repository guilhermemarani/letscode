import java.util.Random;
import java.util.Scanner;

public class ex12 {
    public static void main(String[] Args) {
        Random random = new Random();

        int[] idadeAlunos = new int[30];
        float[] alturasAlunos = new float[30];
        int[] idadeMaior13 = new int[30];
        float[] alturaMaior13 = new float[30];
        float minimoAltura = 1.30F;
        float maximoAltura = 2.20F;
        int contador=0;
        int contador2=0;
        float soma = 0;

        for(int x=0; x < idadeAlunos.length; x++){
           idadeAlunos[x] = random.nextInt(120);
           alturasAlunos[x] = minimoAltura + random.nextFloat() * (maximoAltura - minimoAltura);
           System.out.println((x+1)+" - Idade: "+ idadeAlunos[x]);
           System.out.format("%d - Altura: %.2f\n",(x+1),alturasAlunos[x]);

           if(idadeAlunos[x] > 13){
               if(alturasAlunos[x] > 0) {
                   System.out.println("Idade maior 13: "+idadeAlunos[x]);
                   idadeMaior13[x] = idadeAlunos[x];
                   alturaMaior13[x] = alturasAlunos[x];
                   contador++;
                   soma += alturaMaior13[x];
               }
           }
        }
        soma /= contador;
        for(int y=0; y < alturaMaior13.length; y++){
            if(alturaMaior13[y] < soma){
                if(alturaMaior13[y] > 0) {
                    System.out.format("Altura inferior: %.2f\n", alturaMaior13[y]);
                    contador2++;
                }
            }
        }
        System.out.format("Dos alunos listados, %d tem mais de 13 anos e deles %d tem menos que a altura média %.2f",contador,contador2,soma);
    }
}

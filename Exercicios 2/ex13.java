import java.util.Scanner;

public class ex13 {
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);

        String[] meses = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro",
        "Outubro","Novembro","Dezembro"};
        float[] temperaturas = new float[12];
        float media = 0;

        for(int x=0; x < meses.length; x++){
            System.out.format("Qual a temperatura do mês de %s?:\n",meses[x]);
            temperaturas[x] = scanner.nextFloat();
            media += temperaturas[x];
        }
        media /= 12;

        System.out.format("A média anual de temperatura é %.2f\n",media);
        int contador=0;

        for(int y=0; y < temperaturas.length;y++){
            if(temperaturas[y] > media){
                contador++;
                System.out.format("%d - %s, temperatura %.2f\n",contador,meses[y],temperaturas[y]);
            }
        }
    }
}

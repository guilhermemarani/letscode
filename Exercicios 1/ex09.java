import java.util.Scanner;

public class ex9 {
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);

        String[] nome = new String[10];
        int[] idade = new int[10];
        int indice = 1;
        int menorIdade = 0;
        int validacaoIdade = 150;
        String validacaoNome = null;
        String nomeMenorIdade=null;

        for(int x=0; x<10; x++){
            System.out.format("Digite o nome [%d]:\n",indice);
            nome[x]=scanner.next();
            indice++;
            System.out.format("Qual a idade de %s?\n",nome[x]);
            idade[x]=scanner.nextInt();

            menorIdade = idade[x];
            nomeMenorIdade = nome[x];

            if(menorIdade >= 150){
                System.out.println("Idade inválida");
            }else if(menorIdade < validacaoIdade) {
                validacaoIdade = menorIdade;
                validacaoNome = nomeMenorIdade;
            }
        }
        System.out.format("A pessoa com menor idade é o %s, que tem %d de idade",validacaoNome,validacaoIdade);
    }
}

public class ex15 {
    public static void main(String[] Args){
        float[] numeros = {-1.5f,1.6f,1.9f,10.8f,-10.5f,3.87f,5.97f,4.6f,-98.7f,56.7f};
        int contadorNegativo = 0;
        float soma = 0;

        for(int x=0; x < numeros.length; x++){
            if(numeros[x] < 0){
                contadorNegativo++;
            }else{
                soma += numeros[x];
            }
        }
        System.out.println("A quantidade de números negativos é: "+contadorNegativo);
        System.out.println("E a soma dos números positivos é: "+soma);
    }
}

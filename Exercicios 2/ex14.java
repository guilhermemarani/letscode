public class ex14 {
    public static void main(String[] Args){
        int[] numeros = {1,2,3,4,5,6};
        int[] pares = new int[6];
        int[] impares = new int[6];
        int contadorPar=0;
        int contadorImpar=0;

        for(int x=0; x < numeros.length; x++){
            if(numeros[x] % 2 != 0){
                impares[x] = numeros[x];
                contadorImpar++;
            }else {
                pares[x] = numeros[x];
                contadorPar++;
            }
        }
        System.out.println(contadorPar+" pares");
        for(int par: pares){
            if (par != 0) {
                System.out.println(par);
            }
        }
        System.out.println(contadorImpar+" impares");
        for(int impar:impares){
            if(impar != 0) {
                System.out.println(impar);
            }
        }
    }
}

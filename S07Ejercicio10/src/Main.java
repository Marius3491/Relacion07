public class Main {
    public static void main(String[] args) {
        int i;
        int [] original = new int[20];
        int [] par = new int [20];
        int [] impar = new int [20];
        int [] auxf = new int [20];
        int pares = 0;
        int impares = 0;
        System.out.print("Indice: ");
        for(i=0;i<20;i++){
            System.out.print(i+" ");
        }
        System.out.print("\nValores originales: ");
        for(i=0;i<20;i++){
            original[i] = (int)(Math.random()*101);
            System.out.print(original[i]+" ");
        }
        System.out.println();
        //Separacion de valores en pares e impares
        for(i=0;i<20;i++){
            if(original[i] % 2 == 0){
                par[pares++] = original[i];
            } else {
                impar[impares++] = original[i];
            }
        }
        ////////
        System.out.println(pares);
        System.out.println(impares);

        for(i=0;i<20;i++){
            if(i < pares){
                auxf[i] = par[i];
            } else {
                auxf[i] = impar[i-pares];
            }
            System.out.print(auxf[i]+" ");
        }
    }
}
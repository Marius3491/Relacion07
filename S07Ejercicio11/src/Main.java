import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] n = new int[10];
        int[] primos = new int[10];
        int[] no_primos = new int[10];
        int j;
        int i;
        int cprimos = 0;
        int cnoprimos = 0;
        boolean es_primo;
        Scanner sc = new Scanner(System.in);

        // Introduccion de datos
        System.out.print("Introduce valores: ");
        for (i = 0; i < 10; i++) {
            n[i] = sc.nextInt();
            //Comprobacion de primos.
            es_primo = true;
            for (j = 2; j < n[i] - 1; j++) {
                if (n[i] % j == 0) {
                    es_primo = false;
                }
            }
            //Colocacion de numeros en arrays separados.
            if (es_primo) {
                primos[cprimos++] = n[i];
            } else {
                no_primos[cnoprimos++] = n[i];
            }
        }

        // Muestra de array indice
        System.out.print("Indice: ");
        for (i = 0; i < 10; i++) {
            System.out.print("\t" + i + " ");
        }
        //Muestra de valores del array
        System.out.print("\nValores: ");
        for (i = 0; i < 10; i++) {
            System.out.print("\t" + n[i] + " ");
        }

        //Colocacion de primos al principio
        for (i = 0; i < cprimos; i++) {
            n[i] = primos[i];
        }
        //No primos al final.
        for (i = cprimos; i < cprimos + cnoprimos; i++) {
            n[i] = no_primos[i - cprimos];
        }
        //resultado final.
        System.out.println("\n-------------------------------------------------");
        System.out.print("\nIndice: ");
        for(i=0;i<10;i++){
            System.out.print("\t" + i + " ");
        }
        System.out.print("\nValores: ");
        for(i=0;i<10;i++){
            System.out.print("\t" + n[i] + " ");
        }
    }
}
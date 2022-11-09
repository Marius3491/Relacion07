import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[15];
        int i;
        System.out.println("Introduce los valores del array, luego se mostraran rotados: ");
        for (i = 0; i < 15; i++) {
            num[i] = sc.nextInt();
        }
        //Salida de los valores originales
        System.out.print("*****\tVALORES ORIGINALES\t*****\n");
        System.out.print("Indice: ");
        for (i = 0; i < 15; i++) {
            System.out.print("\t" + i + " ");
        }

        System.out.print("\nValores: ");
        for (i = 0; i < 15; i++) {
            System.out.print("\t" + num[i] + " ");
        }

        //Core de la rotacion de los valores del array.
        int aux = num[14];
        for (i = 14; i > 0; i--) {
            num[i] = num[i - 1];
        }
        num[0] = aux;

        //Salida de los valores rotados
        System.out.print("\n*****\tVALORES ROTADOS\t*****\n");
        System.out.print("Indice: ");
        for(i=0;i<15;i++){
            System.out.print("\t"+i+" ");
        }

        System.out.print("\nValores: ");
        for(i=0;i<15;i++){
            System.out.print("\t"+num[i]+" ");
        }
    }
}
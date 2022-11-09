import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[10];
        int[] resultado = new int[10];
        int i;
        int nInicial;
        int nFinal;
        boolean valido;

        System.out.println("Introduzca 10 números separados: ");

        for (i = 0; i < 10; i++) {
            n[i] = sc.nextInt();
        }

        // Muestra el array original.
        System.out.println("\n\nArray original:");
        System.out.print("Índice ");
        for (i = 0; i < 10; i++) {
            System.out.printf("\t"+i+" ");
        }
        System.out.print("\nValor  ");
        for (i = 0; i < 10; i++) {
            System.out.printf("\t"+n[i]+" ");
        }

        // Pide las posiciones inicial y final.
        do {
            valido = true;

            System.out.print("\nIntroduzca la posición inicial (0 - 9): ");
            nInicial = sc.nextInt();
            if ((nInicial < 0) || (nInicial > 9)) {
                System.out.println("Valor incorrecto, debe ser un número entre el 0 y el 9.");
                valido = false;
            }

            System.out.print("\nIntroduzca la posición final (0 - 9): ");
            nFinal = sc.nextInt();
            if ((nFinal < 0) || (nFinal > 9)) {
                System.out.println("Valor incorrecto, debe ser un número entre el 0 y el 9.");
                valido = false;
            }

            if (nInicial >= nFinal) {
                System.out.println("Valores incorrectos, la posición inicial debe ser menor que la posición final.");
                valido = false;
            }
        } while (!valido);

        // Muestra de nuevo el array original.

        System.out.println("\n---------------------------------------------------------");
        System.out.print("\nÍndice: ");
        for (i = 0; i < 10; i++) {
            System.out.print("\t"+i+" ");
        }
        System.out.print("\nValor: ");
        for (i = 0; i < 10; i++) {
            System.out.print("\t"+n[i]+" ");
        }
        // Copia el array n en resultado.
        for (i = 0; i < 10; i++) {
            resultado[i] = n[i];
        }

        resultado[nFinal] = n[nInicial];

        for (i = nFinal + 1; i < 10; i++)
            resultado[i] = n[i - 1];

        resultado[0] = n[9];

        for (i = 0; i < nInicial; i++)
            resultado[i + 1] = n[i];

        // Muestra el resultado.
        System.out.println("\nArray resultante:");
        System.out.print("Índice: ");
        for (i = 0; i < 10; i++) {
            System.out.print("\t"+i+" ");
        }
        System.out.print("\nValor: ");
        for (i = 0; i < 10; i++) {
            System.out.print("\t"+resultado[i]+" ");
        }
    }
}
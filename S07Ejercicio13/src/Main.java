import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[100];
        int maximo = 0;
        int minimo = 100;

        // Generacion numeros y calculo de min/max
        for (int i = 0; i < 100; i++) {
            n[i] = (int)(Math.random() * 501);

            if (n[i] < minimo) {
                minimo = n[i];
            }

            if (n[i] > maximo)  {
                maximo = n[i];
            }
        }

        // Array original. Estilo for each para controlar mejor los elementos por pantalla
        for (int elemento : n) {
            System.out.print(elemento + " ");
        }

        System.out.print("\n\n¿Qué quiere destacar? (1 – mínimo, 2 – máximo): ");
        int opcion = sc.nextInt();

        int destacado; // aqui decimos que numero es destacado

        if (opcion == 1) {
            destacado = minimo;
        } else {
            destacado = maximo;
        }

        System.out.println();

        // mostramos el resultado de la misma manera.
        for (int elemento : n) {
            if (elemento == destacado) {
                System.out.print(" **" + elemento + "** ");
            } else {
                System.out.print(elemento + " ");
            }
        }
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[][] num = new int[4][5]; // array de 4 filas por 5 columnas
        Scanner sc = new Scanner(System.in);
        int fila;
        int columna;

        // Lectura de los datos introducidos
        System.out.println("Por favor, introduzca los numeros (enteros) en el array");
        for(fila = 0; fila < 4; fila++) {
            for(columna = 0; columna < 5; columna++) {
                System.out.print("Fila " + fila + ", columna " + columna + ": ");
                num[fila][columna] = sc.nextInt();
            }
        }

        System.out.println();

        // datos y suma de filas
        int suma_fila;
        for(fila = 0; fila < 4; fila++) {
            suma_fila = 0;
            for(columna = 0; columna < 5; columna++) {
                System.out.printf("%7d   ", num[fila][columna]);
                suma_fila += num[fila][columna];
            }
            System.out.printf("|%7d\n", suma_fila);
        }

        // datos y suma de columnas y total al final
        for(columna = 0; columna < 5; columna++) {
            System.out.print("----------");
        }
        System.out.println("-----------");

        int suma_columna;
        int suma_total = 0;
        for(columna = 0; columna < 5; columna++) {
            suma_columna = 0;
            for(fila = 0; fila < 4; fila++) {
                suma_columna += num[fila][columna];
            }

            suma_total += suma_columna;
            System.out.printf("%7d   ", suma_columna);
        }
        System.out.printf("|%7d   ", suma_total);
    }
}
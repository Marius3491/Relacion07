import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[20];
        for (int i = 0; i < 20; i++) {
            n[i] = (int)(Math.random() * 381) + 20;
            System.out.print(n[i] + " ");
        }
        System.out.print("\n\n¿Qué números quiere resaltar? ");
        System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
        int opcion = sc.nextInt();
        int multiplo;
        if(opcion == 1){
            multiplo = 5;
        } else{
            multiplo = 7;
        }
// Muestra el resultado. for estilo for-each para controlar la salida.
        for (int elemento : n) {
            if (elemento % multiplo == 0) {
                System.out.print("[" + elemento + "] ");
            } else {
                System.out.print(elemento + " ");
            }
        }
    }
}
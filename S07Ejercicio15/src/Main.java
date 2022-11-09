import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mesa = new int[10];
// Rellena las mesas de forma aleatoria.
        for (int i = 0; i < 10; i++) {
            mesa[i] = (int)(Math.random() * 5);
        }
        int clientes; // número de clientes que llegan al restaurante buscando mesa.
        do {
// Muestra el estado de ocupación de las mesas.

            System.out.print("Mesa nº: \n");
            for (int i = 1; i < 11; i++) {
                System.out.printf("\t"+i+" ");
            }

            System.out.print("Ocupación \n");
            for (int m : mesa) {
                System.out.printf("\t"+m+" ");
            }

            System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
            clientes = sc.nextInt();
            if (clientes > 4) { // Si el grupo de clientes es mayor a 4
                System.out.print("Lo siento, no admitimos grupos de 6, haga grupos de");
                System.out.println(" 4 personas como máximo e intente de nuevo.");
            } else {
// Busca una mesa que esté vacía.
                int i_vacia = 0;
                boolean mesa_vacia = false;
                for(int i = 9; i >= 0; i--) {
                    if (mesa[i] == 0) {
                        i_vacia = i;
                        mesa_vacia = true;
                    }
                }
                if (mesa_vacia) {
                    mesa[i_vacia] = clientes; // coloca a los clientes en la mesa libre
                    System.out.println("Por favor, siéntense en la mesa número " + (i_vacia + 1) + ".");
                } else {
// Busca un hueco para todo el grupo.
                    int i_hueco = 0;
                    boolean hay_hueco = false;
                    for(int i = 9; i >= 0; i--) {
                        if (clientes <= (4 - mesa[i])) {
                            i_hueco = i;
                            hay_hueco = true;
                        }
                    }
                    if (hay_hueco) {
                        mesa[i_hueco] += clientes; // coloca a los clientes en el primer hueco disponible
                        System.out.println("Tendran que compartir mesa. Por favor, sientense en la mesa numero :" + (i_hueco + 1) + ".");
                    } else {
                        System.out.println("Lo siento, en estos momentos no queda sitio.");
                    }
                }
            }
        } while (clientes != -1);
    }
}
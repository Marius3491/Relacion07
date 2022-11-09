import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] color = {
                "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro ", "blanco", "morado"
        };
        String[] palabra = new String[8];
        String[] resultado = new String[8];
        System.out.println("Introduzca 8 palabras (vaya pulsando [INTRO] entre una y otra.");
        int j = 0;
        for (int i = 0; i < 8; i++) {
            palabra[i] = sc.next();

// Si es un color, al array resultado. Hacemos uso de un
// for-each por controlar mejor el recorrido de las palabras.

            for (String c : color) {
                if (palabra[i].equals(c)) {
                    resultado[j++] = c;
                }
            }
        }
// los no-colores al final

        for (int i = 0; i < 8; i++) {
            boolean esColor = false;
            for (String c : color) {
                if (palabra[i].equals(c)) {
                    esColor = true;
                }
            }
            if (!esColor) {
                resultado[j++] = palabra[i];
            }
        }

// Muestra el array original.
        System.out.println("Array original:\n ");


        for (int i = 0; i < 8; i++) {
            System.out.print("\t"+i+" "+"\n");
        }

        for (String p : palabra) {
            System.out.print("\t"+p+" ");
        }

// Muestra el array resultado.
        System.out.println("\tArray resultado: \n");

        for (int i = 0; i < 8; i++) {
            System.out.print("\t"+i+" "+"\n");
        }

        for (String r : resultado) {
            System.out.print("\t"+r+" ");
        }
    }
    }
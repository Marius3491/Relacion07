import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int [] num = new int[100] ;
        for(i=0;i<100;i++){
            num[i] = (int)(Math.random()*21);
            System.out.print(num[i]+" ");
        }
        System.out.println("Se pedira dos valores:");
        System.out.print("Introduce un numero de los que se han mostrado: ");
        int valor1 = sc.nextInt();
        System.out.print("Introduce valor para el reemplazo: ");
        int valor2 = sc.nextInt();

        System.out.println();

        for(i=0;i<100;i++) {
            if (valor1 == num[i]) {
                num[i] = valor2;
                System.out.print(" '" + valor2 + "' ");
            } else {
                System.out.print(num[i]+" ");
            }
        }
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] num = new int[8];
        int i;

        for(i=0;i<8;i++){
            System.out.print("Introduce valor ");
            num[i] = sc.nextInt();
        }
        for(i=0;i<8;i++){
            if (num[i] % 2 == 0) {
                System.out.println(num[i]+" es par");
            } else {
                System.out.println(num[i]+" es impar");
            }
        }
    }
}
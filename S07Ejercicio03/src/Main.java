import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int i;
        System.out.println("Introduce numeros para introducir en el array: ");
        for(i=0;i<10;i++){
            num[i] = sc.nextInt();
        }
        for(i = 9; i>=0; i--){
            System.out.println(num[i]);
        }
    }
}
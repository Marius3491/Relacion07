import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int max = 0;
        int min = 9999;
        int [] num = new int[10];
        System.out.println("Introduce 10 valores, al final se mostraran los numeros introducidos, el max y el min");
        for(i=0;i<10;i++){
            num[i]= sc.nextInt();
            if(num[i] < min ){
                min = num[i];
            }
            if(num[i] > max){
                max = num[i];
            }
        }
        System.out.println();

        for(i=0;i<10;i++){
            System.out.print(num[i]);
            if(num[i]==min){
                System.out.print(" Minimo");
            }
            if(num[i]==max){
                System.out.print(" Maximo");
            }
            System.out.println();
        }


    }
}
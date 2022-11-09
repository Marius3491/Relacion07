import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mes [] = {"ENE","FEB","MAR","ABR","MAY","JUN","JUL","AGO","SEP","OCT","NOV","DIC"};
        int [] temp  = new int[12];
        int i;
        for(i=0;i<12;i++){
            System.out.print("Introduce temperatura media para "+mes[i]+": ");
            temp[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("____Desglose de temperaturas medias por mes____");
        for(i=0;i<12;i++){
            System.out.println("\t\t\t"+mes[i]+" -------- "+temp[i]+"C°");
        }

    }
}
public class Main {
    public static void main(String[] args) {
        int i;
        int[] num = new int[20];
        int[] cubo = new int [20];
        int[] cuadrado = new int [20];


        for (i = 0; i < 20; i++) {
            num[i] = (int) (Math.random() * 101);
            cubo[i] = num[i]*3;
            cuadrado[i] = num[i]*2;
            System.out.println("Numero: "+num[i]+" Cubo: "+cubo[i]+" Cuadrado: "+cuadrado[i]);
        }
    }
}
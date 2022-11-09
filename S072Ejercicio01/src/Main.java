public class Main {
    public static void main(String[] args) {
        int fila;
        int columna;
        int[][] n = new int [3][6];
        n[0][0] = 0;
        n[0][1] = 30;
        n[0][2] = 2;
        n[0][5] = 5;
        n[1][0] = 75;
        n[1][4] = 0;
        n[2][2] = -2;
        n[2][3] = 9;
        n[2][5] = 11;
        for(fila=0;fila<3;fila++){
            System.out.print("Fila: "+fila+" ");
            for(columna=0;columna<6;columna++){
                System.out.print("Columna: "+columna+"-"+n[fila][columna]+" ");
            }
            System.out.println();
        }
    }
}
public class MatrizEvaluable {
    public static void main(String[] args) {
        final int FILAS = 5;
        final int COLUMNAS = 5;
        int[][] TABLA = new int[FILAS][COLUMNAS];
        int[][] TABLA2 = new int [FILAS] [COLUMNAS];
        RellenarNumAleatorio(TABLA, FILAS, COLUMNAS, 0, 9);
        RellenarNumAleatorio2(TABLA2, FILAS, COLUMNAS, 0, 9);
    }

    public static void RellenarNumAleatorio(int lista[][], int fil, int col, int a, int b) {
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                lista[i][j] = (int) Math.floor(Math.random() * (a - b) + 9);
                System.out.print(lista[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    public static void RellenarNumAleatorio2(int lista[][], int fil, int col, int a, int b) {
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                lista[i][j] = (int) Math.floor(Math.random() * (a - b) + 9);
                System.out.print(lista[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

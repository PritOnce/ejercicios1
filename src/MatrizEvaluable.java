public class MatrizEvaluable {
    public static void main(String[] args) {
        final int FILAS = 5;
        final int COLUMNAS = 5;
        int[][] TABLA = new int[FILAS][COLUMNAS];
        int[][] TABLA2 = new int[FILAS][COLUMNAS];
        RellenarNumAleatorio(TABLA, FILAS, COLUMNAS, 0, 9);
        RellenarNumAleatorio2(TABLA2, FILAS, COLUMNAS, 0, 9);
        SumaDeNumAleatorios(TABLA,TABLA2);
    }

    public static void RellenarNumAleatorio(int[][] lista, int fil, int col, int a, int b) {
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
    public static void RellenarNumAleatorio2(int [][] lista2, int fil, int col, int a, int b) {
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                lista2[i][j] = (int) Math.floor(Math.random() * (a - b) + 9);
                System.out.print(lista2[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void SumaDeNumAleatorios(int [][] suma1, int [][] suma2){
        int[][] RESULTADO= new int[5][5];
        for (int q=0; q < suma1.length; q++){
            for (int w=0; w< suma2.length; w++){
                RESULTADO[q][w]=suma1[q][w]+suma2[q][w];
                System.out.print(RESULTADO[q][w]+"\t");
            }
            System.out.println();
        }
    }
}

import javax.crypto.Mac;

public class Matrices {
    public static void main(String[] args) {
        final int FILAS = 4;
        final int COLUMNAS = 5;
        int[][] TABLA = new int[FILAS][COLUMNAS];
        //int [][] TABLA=new int [4] [5]
        RellenarNumAleatorio(TABLA,FILAS, COLUMNAS,0,99);
        MostrarTabla(TABLA,FILAS,COLUMNAS);
    }

    public static void RellenarNumAleatorio(int lista[][], int fil,int col,int a, int b) {
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                lista[i][j] = (int) Math.floor(Math.random() * (a - b) + 99);
            }
        }
    }

    public static void MostrarTabla(int lista[][],int fil,int col){
        int suma=0;
        for(int i=0;i< fil;i++){
            for(int j=0;j<col;j++){
                System.out.print(lista[i][j]+"\t");
                suma+=lista[i][j];
            }
        }System.out.println("La suma es "+suma);
    }
}

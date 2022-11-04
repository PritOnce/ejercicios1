import java.rmi.MarshalException;
import java.util.Scanner;

public class ArrayE4Good {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        System.out.println("¿Que tamaño quieres?");
        int TAMAÑO=sr.nextInt();
        int [] capacidad= new int[TAMAÑO];
        rellenarNumAleatorArray(capacidad,0,9);
        mostrarArray(capacidad);
    }

    public static void rellenarNumAleatorArray(int lista[], int a, int b) {
        for(int i=0;i<lista.length;i++){
            //Generar el aleatorio y rellenar
            lista[i]=(int)Math.floor(Math.random()*(a-b)+9);
        }
    }
    public static void mostrarArray(int lista[]){
        int suma=0;
        for(int i=0;i<lista.length;i++){
            suma+=lista[i];
            System.out.println("El indice "+i+" contiene el valor "+lista[i]);
        }
        System.out.println("La suma es "+suma);
    }
}

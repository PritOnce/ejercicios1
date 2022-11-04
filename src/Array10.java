import java.util.Scanner;

public class Array10 {
    public static void main(String[] args) {
        final int TAMANO=10;
        int lista[]=new int [TAMANO];
        Scanner sr=new Scanner(System.in);
        /*Cargamos el array con los datos del usuario*/
        for(int i=0;i<lista.length;i++){
            System.out.println("Introduce un número");
            String texto=sr.next();
            lista[i]=Integer.parseInt(texto);//Convierte el String a entero
        }
        /*Mostramos los datos del array*/
        for(int i=0;i< lista.length;i++){
            System.out.println("El indice "+i+" contiene el valor "+lista[i] );
        }
    }
}

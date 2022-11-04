import java.util.Scanner;

public class ArrayComSuma {
    public static void main(String[] args) {
        final int CAPACIDAD=5;
        int lista[]=new int [CAPACIDAD];
        int resultado=0;
        int valor;
        Scanner sr=new Scanner(System.in);
        for(int i=0;i<lista.length;i++){
            System.out.println("Introduce un numero");
            valor= sr.nextInt();
            lista[i]=valor;
            resultado+=lista[i];
        }
        System.out.println("El resultado de la suma es "+resultado);
    }
}

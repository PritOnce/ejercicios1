import java.util.Scanner;

public class ArrayE1 {
    public static void main(String[] args) {
        Scanner sr= new Scanner(System.in);
        int [] numero=new int[10];
        int minimo=Integer.MAX_VALUE;
        int maximo=Integer.MIN_VALUE;
        int posiciónMax=0;
        int posiciónMIN=0;
        System.out.println("Introduce un número");

        for(int i=0;i<numero.length;i++){
            numero[i]=sr.nextInt();
            if(numero[i]<=minimo){
                minimo=numero[i];
                posiciónMIN=i+1;
            }
            if(numero[i]>=maximo){
                maximo=numero[i];
                posiciónMax=i+1;
            }
        }
        System.out.println("El valor máximo es "+maximo+" y está en la posición "+posiciónMax);
        System.out.println("El valor mínimo es "+minimo+" y está en la posición "+posiciónMIN);
    }
}

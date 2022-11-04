import java.util.Scanner;

public class ArrayE4 {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        System.out.println("¿  Que tamaño quieres?");
        int TAMAÑO=sr.nextInt();
        int [] capacidad= new int[TAMAÑO];
        int suma=0;
        for(int i=0;i<capacidad.length;i++){
            capacidad[i]=(int)Math.floor(Math.random()*10);
            System.out.println("El valor es "+capacidad[i]);
            suma+=capacidad[i];
            System.out.println("La posición es "+(i+1));
        }
        System.out.println("La suma es "+suma);
    }
}

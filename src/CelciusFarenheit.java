import java.util.Scanner;

public class CelciusFarenheit {
    public static void main (String [] args){
        //introducimos la variable de los celcius
        double grados, resultado;
        Scanner sr=new Scanner(System.in);
        System.out.println("Intoduce los gradis centigradso");
        grados=sr. nextDouble();
        resultado=(32+(9*grados/5));
        System.out.println("Tus grados son "+resultado);
    }
}

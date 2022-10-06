import java.util.Scanner;

public class NumerosPantalla {
    public static void main (String [] args) {
        //debo intducir las dos variables
        int num1, num2;
        //declaramos la variable para el letor por pantalla
        Scanner src=new Scanner(System.in);
        System.out.println("Introduce un número");
        //esto permite coger el numero que introduce el usuario
        num1=src.nextInt();
        System.out.println("Introduce otro número");
        num2= src.nextInt();
        System.out.println("Los valores introducidos son "+num1+" y "+num2);
    }
}

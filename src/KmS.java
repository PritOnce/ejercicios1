import java.util.Scanner;

public class KmS {
    public static void main (String [] args){
        double kph, ms;
        Scanner sr=new Scanner(System.in);
        System.out.println("Introdude los Kilometro por hora");
        kph= sr.nextDouble();
        ms= (kph*1000/3600);
        System.out.println("El valor transformado es "+ms);
    }
}

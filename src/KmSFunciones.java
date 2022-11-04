import java.util.Scanner;

public class KmSFunciones {
    public static void main(String[] args) {
        double kph;
        Scanner sr=new Scanner(System.in);
        System.out.println("Introdude los Kilometro por hora");
        kph= sr.nextDouble();
        RellenarMS(kph);
    }

    public static void RellenarMS(double vel) {
        double ms;
        ms=(vel*1000/3600);
        System.out.println("El valor transformado es "+ms);
    }

}

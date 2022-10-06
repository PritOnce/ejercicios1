import java.util.Scanner;

public class Circunferencia {
    public static void main (String [] args){
        double radio, perimetro, area;
        Scanner sr=new Scanner(System.in);
        System.out.println("Introdude el radio de la circunferencia");
        radio= sr. nextDouble();
        area=(Math.PI*Math.pow(radio,2));
        System.out.println("El area de tu circunferencia es "+area);
        perimetro=(2*Math.PI*area);
        System.out.println("El perimetro de tu circunferencua es "+perimetro);
    }
}

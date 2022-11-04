import java.util.Scanner;

public class CircunferenciaFunciones {
    public static void main(String[] args) {
        double radio;
        Scanner sr=new Scanner(System.in);
        System.out.println("Introdude el radio de la circunferencia");
        radio= sr.nextDouble();
        RellenarArea(radio);
        RellenarPeri(radio);
    }
    public static void RellenarArea(double r){
        double area;
        area=(Math.PI*Math.pow(r,2));
        System.out.println("El area de tu circunferencia es "+area);
    }
    public static void RellenarPeri(double r){
        double perimetro;
        perimetro=(2*Math.PI*r);
        System.out.println("El perimetro de tu circunferencua es "+perimetro);
    }
}

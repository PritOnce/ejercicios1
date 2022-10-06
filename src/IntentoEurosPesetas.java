import java.util.Scanner;

public class IntentoEurosPesetas {
    public static void main(String[] args) {
        int num1;
        double peseta, euro;
        Scanner sr = new Scanner(System.in);
        System.out.println("Introduce 1 si quieres convertir euros, 2 si quieres transformar a pestas");
        num1 = sr.nextInt();
        if (num1 == 1) {
            System.out.println("Introduce el valor");
            euro = sr.nextDouble();
            peseta = (euro * 166.386);
            System.out.println("La transfomación es " + peseta);
        } else {
            System.out.println("Introduce el valor");
            peseta = sr.nextDouble();
            euro = (peseta / 166.386);
            System.out.println("La transformación es " + euro);
        }
    }
}

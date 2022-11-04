import java.util.Scanner;

public class CelciusFarenheitFunciones {
    public static void main(String[] args) {
        double grados;
        Scanner sr=new Scanner(System.in);
        System.out.println("Intoduce los grados centigrados");
        grados=sr. nextDouble();
        RellenarTemp(grados);
    }

    public static void RellenarTemp(double c) {
        double fare;
        fare=(32+(9*c/5));
        System.out.println("Tus grados en farenhait son "+fare);
    }
}

import java.util.Scanner;

public class P23 {
    public static void main(String[] args) {
        System.out.println("Introduzca un número del 1 al 7 según el dia de la semana");
        int dia;
        Scanner sr=new Scanner(System.in);
        dia= sr.nextInt();
        switch (dia){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Es laboral");
                break;
            case 6:
            case 7:
                System.out.println("No es laboral");
                break;
            default:
                System.out.println("El valor es incorrecto");
        }
    }
}

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        int nota;
        System.out.println("Introduce tu nota");
        Scanner sr=new Scanner(System.in);
        nota= sr.nextInt();
        switch (nota){
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Suspendido");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7:
                System.out.println("Notable bajo");
                break;
            case 8:
                System.out.println("Notable alto");
            case 9:
                System.out.println("Excelente");
                break;
            case 10:
                System.out.println("Matricula de honor");
                break;

            default:
                System.out.println("Nota invalida");
        }
    }
}

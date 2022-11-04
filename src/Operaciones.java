import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {
        int  opcion;
        double resultado,valor1, valor2;
        System.out.println("Introduce dos valores");
        Scanner sr=new Scanner(System.in);
        valor1=sr.nextDouble();
        valor2=sr.nextDouble();
        System.out.println("1 para sumar, 2 para restar, 3 para multiplicar, 4 para dividir");
        opcion= sr.nextInt();
        switch (opcion){
            case 1: resultado=valor1+valor2;
                System.out.println(resultado);
                break;
            case 2: resultado=valor1-valor2;
                System.out.println(resultado);
                break;
            case 3: resultado=valor1*valor2;
                System.out.println(resultado);
                break;
            case 4: resultado=valor1/valor2;
                System.out.println(resultado);
                break;
            default:
                System.out.println("Opción invalida");
        }
    }
}

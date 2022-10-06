import java.util.Scanner;

public class DobleTripleNumero {
    public static void main (String [] args){
        //introduzco las variables
        int num1;
        //declaramos la variable para el letor por pantalla
        Scanner src=new Scanner(System.in);
        System.out.println("Introduce un número");
        num1=src.nextInt();
        //ahora vendria poner el doble y el triple del numero introducido
        System.out.println("El doble de "+num1+" es "+num1*2);
        System.out.println("EL triple de "+num1+"es "+num1*3);
    }
}

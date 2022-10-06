import java.sql.SQLOutput;
import java.util.Scanner;

public class Pesetas {
    public static void main (String [] args){
        double euro, peseta, euro2, peseta2;
        Scanner sr=new Scanner(System.in);
        System.out.println("Introduce tus euros");
        euro= sr.nextDouble();
        peseta= (euro*166.386);
        System.out.println("Introduce tus pesetas");
        peseta2= sr.nextDouble();
        euro2= (peseta2/166.386);
        System.out.println("Tus euros en pesetas son " +peseta);
        System.out.println("Tu pesetas en euros son" +euro2);
    }
}

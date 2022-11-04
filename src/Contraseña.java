import java.util.Scanner;

public class Contraseña {
    public static void main(String[] args) {
        String passw="esternocleidomastoideo";
        boolean acertado=false;
        Scanner sr=new Scanner(System.in);
        String contraseña;
        System.out.println("Mete la puta contraseña");
        for(int contador = 0; contador<3 && !acertado; contador++){
            contraseña=sr.next();
            if (contraseña.equals(passw)) {
                System.out.println("SEEEEEEE");
                acertado = true;
            }else {
                System.out.println("Intentalo de nuevo tontito");
            }
        }

    }
}

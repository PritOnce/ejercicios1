import java.io.IOException;

public class Comparador {
    public static void main(String[] args) throws IOException {
        char car, car1;
        System.out.println("Introduce un caracteres");
        car=(char)System.in.read();
        System.in.read();
        System.out.println("Introduce otro caracter");
        car1=(char)System.in.read();
        if (car==car1){
            System.out.println("Los dos caracteres son iguales");
        } else {
            System.out.println("Los dos caracteres no son iguales");
        }
    }
}

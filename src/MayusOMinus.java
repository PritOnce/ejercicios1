import java.io.IOException;

public class MayusOMinus {
    public static void main(String[] args) throws IOException {
        System.out.println("Introduce una letra");
        char car;
        car=(char)System.in.read();
        if (Character.isUpperCase(car)) {
            System.out.println("Tu letra es mayúscula");
        }else{
            System.out.println("Tu letra es minuscula");
        }
    }
}

import java.io.IOException;

public class MinusOMayus {
    public static void main(String[] args) throws IOException {
        char car, car1;
        System.out.println("Introduce una letra");
        car=(char)System.in.read();
        System.in.read();
        System.out.println("Introduce otra letra, tonto");
        car1=(char)System.in.read();
        if (Character.isLowerCase(car)){
            System.out.println(""+car+" es minúscula");
            if (Character.isLowerCase(car1)){
                System.out.println(""+car1+" tambine es minuscula");
            }else {
                System.out.println(""+car1+" no es minuscula");
            }
        }else{
            System.out.println(""+car+"no es minuscula");
        }
    }
}

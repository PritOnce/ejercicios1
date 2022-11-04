import java.util.Scanner;

public class AreaTriangleQuadratPentagon {
    public static void main(String[] args){
        int num1;
        double base, altura, area, lado, apotema;
        Scanner sr = new Scanner(System.in);
        System.out.println("Introduce 1 si quieres calcular el area del triangulo, 2 si es de un cuadrado o 3 si es la de un petagono");
        num1 = sr.nextInt();
        if (num1 ==1){
            System.out.println("Introduce la base y la altura");
            base = sr.nextDouble();
            altura = sr.nextDouble();
            area = (base*altura/2);
            System.out.println(("El area de tu triangulo es "+area));
        } else if (num1==2){
        System.out.println("Introduce el lado");
            lado = sr.nextDouble();
            area = (lado*lado);
            System.out.println("El area de tu cuadrado es"+area);
        } else{
            System.out.println("Introduce el lado y el apotema");
            lado=sr.nextDouble();
            apotema=sr.nextDouble();
            area=(5*lado*apotema/2);
            System.out.println("El area de tu pentagono es"+area);
        }
    }
}

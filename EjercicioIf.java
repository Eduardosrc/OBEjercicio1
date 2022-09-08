import java.util.Scanner;

public class EjercicioIf{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ingrese un número");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println("El número es positivo");
        }else if(num < 0){
            System.out.println("El número es negativo");
        }else{
            System.out.println("El número es 00");
        }
    }
}

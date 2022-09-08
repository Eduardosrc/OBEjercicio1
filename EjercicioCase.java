import java.util.Scanner;

public class EjercicioCase {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ingrese un número");
        int caso = sc.nextInt();

        switch(caso){
            case 1: System.out.println("Otoño");
            break;
            case 2: System.out.println("Invierno");
            break;
            case 3: System.out.println("Primavera");
            break;
            case 4: System.out.println("Verano");
            break;
            default: System.out.println("Ingrese un número del 1 al 4");
            break;
        }
    }
}

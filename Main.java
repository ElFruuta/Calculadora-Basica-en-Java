import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double num1, num2;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Cuales son tus numeros?:");

        num1 = teclado.nextDouble();
        num2 = teclado.nextDouble();

        System.out.println("Que operacion quiere hacer?(+,-,*,/):");

        char op = teclado.next().charAt(0);
        double o = 0;

        switch (op) {
            case '+':
                o = num1 + num2;
                break;
            case '-':
                o = num1 - num2;
                break;
            case '*':
                o = num1 * num2;
                break;
            case '/':
                o = num1 / num2;
                break;
            default:
                System.out.println("Ingrese un numero valido");
        }

        System.out.println("RESULTADO: ");

        System.out.println(num1 + " " + op + " " + num2
                + " = " + o);
    }
}
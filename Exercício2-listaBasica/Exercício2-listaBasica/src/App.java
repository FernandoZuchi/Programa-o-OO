import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner le =  new Scanner(System.in);
        Imprime NumImpares = new Imprime();

        System.out.print("Valor 1: ");
        int num1 = le.nextInt();

        System.out.print("Valor 2: ");
        int num2 = le.nextInt();

        NumImpares.calcImpares(num1, num2);
    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);

        System.out.println("Informe o modelo do carro");
        String modelo = le.nextLine();

        System.out.println("Informe o preço base do carro: R$");
        double precoBase = le.NextDouble();
    }
}

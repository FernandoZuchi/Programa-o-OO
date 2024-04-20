import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);

        System.out.println("Digite o modelo do carro:");
        String modelo = le.nextLine();

        System.out.println("Digite o preço base do carro:");
        double precoBase = le.nextDouble();

        Carro carro = new Carro(modelo, precoBase);

        


        // Calculando e mostrando o preço final
        double precoFinal = carro.calculaPrecoFinal();
        System.out.println("Preço final do carro: R$" + precoFinal);
    }
}
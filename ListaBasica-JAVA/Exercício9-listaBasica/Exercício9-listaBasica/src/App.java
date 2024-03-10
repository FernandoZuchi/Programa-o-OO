import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Emprestimo emprestimo1 = new Emprestimo();

        System.out.println("Informe o valor do empréstimo: ");
        emprestimo1.setValor(leia.nextDouble());

        System.out.println("Informe a taxa de juros: ");
        emprestimo1.setTaxaJurosMensal(leia.nextDouble());

        System.out.println("Informe o tempo em meses: ");
        emprestimo1.setMeses(leia.nextInt());

        System.out.println("Valor da mensalidade: " + emprestimo1.calculaMensalidade());
        System.out.println("Valor total pago ao final do empréstimo: " + emprestimo1.calcularValorTotalPago());
        System.out.println("Total pago de juros: " + emprestimo1.calcularTotalPagoJuros());

        leia.close();
}
}

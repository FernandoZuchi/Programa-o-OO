import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);

        System.out.print("Informe a idade do empregado: ");
        int idade = le.nextInt();

        System.out.print("Informe a quantidade de anos trabalhados: ");
        int anosTrabalhados = le.nextInt();

        Empregado empregado = new Empregado(idade, anosTrabalhados);

        empregado.estaQualificado();

        le.close();
    }
}

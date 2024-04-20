import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        Scanner le = new Scanner(System.in);
        Qualificado e1 = new Qualificado();
        System.out.print("Informe sua idade:");
        e1.setIdade(le.nextInt());
        System.out.print("Informe seus anos trabalhados: ");
        e1.setAnosTrabalhados(le.nextInt());
        e1.eQualificado();
    }
}

import java.util.Scanner;

public class Carro {
    private String modelo;
    private double precoBase;
    private boolean ar;
    private boolean cambioAutomatico;
    private boolean alarme;
    private boolean pinturaEspecial;
    private boolean tetoSolar;
    private boolean kitMultimidia;

    // Método construtor
    public Carro(String modelo, double precoBase) {
        this.modelo = modelo;
        this.precoBase = precoBase;
    }

    public void adicionarOpcionais(boolean ar, boolean cambioAutomatico, boolean alarme, boolean pinturaEspecial, boolean tetoSolar, boolean kitMultimidia)
    {
        Scanner le = new Scanner(System.in);

        System.out.println("Deseja adicionar Ar? (true/false)");
        ar = le.nextBoolean();

        System.out.println("Deseja adicionar Câmbio automático? (true/false)");
        cambioAutomatico = le.nextBoolean();

        System.out.println("Deseja adicionar Alarme? (true/false)");
        alarme = le.nextBoolean();

        System.out.println("Deseja adicionar Pintura especial? (true/false)");
        pinturaEspecial = le.nextBoolean();

        System.out.println("Deseja adicionar Teto solar? (true/false)");
        tetoSolar = le.nextBoolean();

        System.out.println("Deseja adicionar Kit multimídia? (true/false)");
        kitMultimidia = le.nextBoolean();
    }

    public double calculaPrecoFinal()
    {
        double precoFinal = precoBase;
        double potencia = modelo.contains("1.0") ? 0.1 : 0.2;
        precoFinal *= modelo.contains("importado") ? 1.3 : 1.0;

        precoFinal += ar ? 3000 : 0;
        precoFinal += cambioAutomatico ? 5000: 0;
        precoFinal += alarme ? 800 : 0;
        precoFinal += pinturaEspecial ? 2500 : 0;
        precoFinal += tetoSolar ? 4000 : 0;
        precoFinal += kitMultimidia ? 1800 : 0;
    
        precoFinal *= (1 + potencia);

        return precoFinal;
    }

}

public class Carro {
    private String modelo;
    private double preco;
    private boolean importado;
    private double potenciaMotor;
    private String[] opcionais;
    private int qtdOpcionais;

    // Método construtor
    public Carro(String modelo, double preco, boolean importado, double potenciaMotor, int qtdOpcionais)
    {
        this.modelo = modelo;
        this.preco = preco;
        this.importado = importado;
        this.potenciaMotor = potenciaMotor;
        this.opcionais =  new String[qtdOpcionais];
    }

    // Método para calcular o preço do carro de acordo com os dados
    public double calculaPreco()
    {
        double precoFinal = preco;
    }
}

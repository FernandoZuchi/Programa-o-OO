public class Retangulo {
    // Atributos da classe retângulo
    private double comprimento;
    private double largura;

    // Método construtor da classe 
    public Retangulo(double comprimento, double largura)
    {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    // Método para calcular área 
    public double calcularArea()
    {
        return comprimento * largura;
    }

    // Método para calcular o perímetro 
    public double calcularPerimetro()
    {
        return (2 * (comprimento + largura));
    }
}

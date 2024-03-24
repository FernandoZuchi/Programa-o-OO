public class Retangulo
{
    private double comprimento, largura;
    
    // Método construtor
    public Retangulo(){}
    public Retangulo(double comprimento, double largura)
    {
        this.comprimento = comprimento;
        this.largura = largura;
    }
    
    // Método para calcular a área
    public double calculaArea()
    {
        return comprimento * largura;
    }
    
    // Método para calcular o perímetro
    public double calculaPerimetro()
    {
        return (comprimento * 2) + (largura * 2);    
    }
    
    
    // Métodos de acesso
    public void setComprimento(double comprimento)
    {
        this.comprimento = comprimento;
    }
    
    public double getComprimento()
    {
        return comprimento;
    }
    
    public void setLargura(double largura)
    {
        this.largura = largura;
    }
    
    public double getLargura()
    {
        return largura;
    }
}

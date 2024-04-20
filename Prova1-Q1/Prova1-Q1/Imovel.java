public class Imovel
{
    private int numero;
    private int metrosQuadrados;
    private String proprietario;
    
    public Imovel(int metrosQuadrados, int numero, String proprietario)
    {
        this.proprietario = proprietario;
        this.metrosQuadrados = metrosQuadrados;
        this.numero = numero;
    }
    
    public void Imovel(int numero, int metrosQuadrados, String proprietario)
    {
    
    }
    
    public double valorVenal()
    {
    
    }
    
    public double valorVenda()
    {
    
    }
    
    public int getNumero()
    {
        return numero;
    }
    
    public void setNumero(int numero)
    {
        this.numero = numero;
    }
    
    public int getMetrosQuadrados()
    {
        return metrosQuadrados;
    }
    
    public void setMetrosQuadrados(int metrosQuadrados)
    {
        this.metrosQuadrados = metrosQuadrados;
    }
}

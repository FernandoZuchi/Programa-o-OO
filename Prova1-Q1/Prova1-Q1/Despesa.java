
public class Despesa
{
    int mesAno;
    String descricao;
    double valor;
    boolean taxaExtra;
    
    public Despesa()
    {
        
    }
    
    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }
    
    public String getDescricao()
    {
        return descricao;
    }
    
    public int getMesAno()
    {
        return mesAno;
    }
    
    public void setMesAno(int mesAno){
        
        this.mesAno = mesAno;
    }    
    
    public double getValor()
    {
        return valor;
    }
    
    public void setValor(double valor)
    {
        this.valor = valor;
    }
}

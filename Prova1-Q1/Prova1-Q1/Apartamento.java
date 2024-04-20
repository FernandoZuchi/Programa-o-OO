public class Apartamento extends Imovel
{
    private int nroQuarto;
    
    public Apartamento()
    {
        super(0, 0, "");
    }
    
    public int getNroQuarto()
    {
        return nroQuarto;
    }
    
    public void setNroQuarto(int nroQuarto)
    {
        this.nroQuarto = nroQuarto;
    }
}

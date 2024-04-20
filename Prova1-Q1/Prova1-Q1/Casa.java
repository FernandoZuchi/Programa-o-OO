public class Casa extends Imovel implements CondominioFechado
{
    private int metragemTerreno;
    
    public Casa()
    {
        super(0, 0, "");
    }
    
    public void setMetragemTerreno(int metragemTerreno)
    {
        this.metragemTerreno = metragemTerreno;
    }
    
    public int getMetragemTerreno()
    {
        return metragemTerreno;
    }
}

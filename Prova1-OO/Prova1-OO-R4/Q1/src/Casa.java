public class Casa extends Imovel{
    private int metragemTerreno;

    public Casa(){
        super(0,0,"");
    }

    public double valorTerreno(){
        return metragemTerreno * 350;
    }

    public double valorVenal()
    {
        return (metragemTerreno * 350)
    }

    @Override
    public double valorVenda()
    {
        return valorVenal() * 0.85 + (valorTerreno());
    }
}

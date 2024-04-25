public class Cobertura extends Imovel {
    private boolean duplex, triplex;

    public Cobertura(){
        super(0,0,"");
    }

    public double valorVenal()
    {
        double duplex = (duplex) ? 2 : 1;
        double triplex = (triplex) ? 3 : 1;

        return (metrosQuadrados * 1000) * duplex * triplex;
    }

}

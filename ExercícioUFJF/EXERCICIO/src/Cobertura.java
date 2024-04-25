public class Cobertura extends Imovel {
    private boolean duplex;
    private boolean triplex;

    public Cobertura()
    {
        super(0,0,"");
    }

    public double valorVenal()
    {
        return 0;
    }

    public void setDuplex(boolean duplex) {
        this.duplex = duplex;
    }

    public void setTriplex(boolean triplex) {
        this.triplex = triplex;
    }

}

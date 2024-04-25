public class Apartamento extends Imovel {
    private int nroQuarto;

    public Apartamento()
    {
        super(0,0,"");
    }
    public Apartamento(int nroQuarto)
    {
        super(0,0,"");
        this.nroQuarto = nroQuarto;
    }

    @Override
    public double valorVenal()
    {
        return super.valorVenal() + (500 * nroQuarto);
    }

    public int getNroQuarto() {
        return nroQuarto;
    }

    public void setNroQuarto(int nroQuarto) {
        this.nroQuarto = nroQuarto;
    }
}

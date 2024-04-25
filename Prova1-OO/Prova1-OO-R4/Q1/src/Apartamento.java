public class Apartamento extends Imovel{
    private int nroQuarto;

    public Apartamento(int nroQuarto)
    {
        super(0,0,"");
        this.nroQuarto = nroQuarto;
    }

    private double valorVenal(){
        return (valorVenal() * 0.85) + (500 * nroQuarto);
    }
}

public abstract class Imovel {
    private Condominio condominio;
    private int numero;
    protected int metrosQuadrados;
    private String proprietario;

    public Imovel(){}

    public Imovel(int numero, int metrosQuadrados, String proprietario)
    {
        this.numero = numero;
        this.metrosQuadrados = metrosQuadrados;
        this.proprietario = proprietario;
    }

    public abstract double valorVenal();
    
    public double valorVenda()
    {
        return valorVenal() * 0.85;
    }

    public Condominio getCondominio() {
        return condominio;
    }

    public void setCondominio(Condominio condominio) {
        this.condominio = condominio;
    }

    public int getMetrosQuadrados() {
        return metrosQuadrados;
    }

    public void setMetrosQuadrados(int metrosQuadrados) {
        this.metrosQuadrados = metrosQuadrados;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

}

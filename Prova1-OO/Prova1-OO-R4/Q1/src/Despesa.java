public class Despesa {
    private Condominio condominio;
    private int mesAno;
    private String descricao;
    private double valor;
    private boolean taxaExtra;

    public Despesa(){}

    public void setCondominio(Condominio condominio) {
        this.condominio = condominio;
    }

    public Condominio getCondominio() {
        return condominio;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setMesAno(int mesAno) {
        this.mesAno = mesAno;
    }

    public int getMesAno() {
        return mesAno;
    }

    public void setTaxaExtra(boolean taxaExtra) {
        this.taxaExtra = taxaExtra;
    }

    public double getValor() {
        return valor;
    }
    
}

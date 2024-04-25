public class Pagamento {
    private Condominio condominio;
    private int mesAno;
    private double valorPago;

    public Pagamento(){}

    public void setCondominio(Condominio condominio) {
        this.condominio = condominio;
    }

    public Condominio getCondominio() {
        return condominio;
    }

    public void setMesAno(int mesAno) {
        this.mesAno = mesAno;
    }

    public int getMesAno() {
        return mesAno;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public double getValorPago() {
        return valorPago;
    }
    
}

public class Pagamento
{
    private int mesAno;
    private double valorPago;
    
    public Pagamento(int mesAno, double valorPago)
    {
        this.mesAno = mesAno;
        this.valorPago = valorPago;
    }
    
    public void setMesAno(int mesAno)
    {
        this.mesAno = mesAno;
    }
    
    public int getMesAno()
    {
        return mesAno;
    }
    
    public void setValorPago(double valorPago)
    {
        this.valorPago = valorPago;
    }
    
    public int getValorPago()
    {
        return valorPago;
    }
}

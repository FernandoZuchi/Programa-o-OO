public class Emprestimo {
    private double valor;
    private double taxaJurosMensal;
    private int meses;

    // Construtor
    public Emprestimo()
    {

    }
    public Emprestimo(double valor, double taxaJurosMensal, int meses) {
        this.valor = valor;
        this.taxaJurosMensal = taxaJurosMensal;
        this.meses = meses;
    }

    // Métodos de acesso
    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    public int getMeses() {
        return meses;
    }

    public void setTaxaJurosMensal(double taxaJurosMensal) {
        this.taxaJurosMensal = taxaJurosMensal;
    }

    public double getTaxaJurosMensal() {
        return taxaJurosMensal;
    }

    // Método para calcular o valor da mensalidade
    public double calculaMensalidade()
    {
        return (valor + valor * (taxaJurosMensal / 100)) / meses;
    }

    // Método para calcular o valor total a ser pago
    public double calcularValorTotalPago()
    {
        return calculaMensalidade() * meses;
    }

    // Método para calcular o valor de juros que foi pago
    public double calcularTotalPagoJuros()
    {
        return calcularValorTotalPago() - valor;
    }
}

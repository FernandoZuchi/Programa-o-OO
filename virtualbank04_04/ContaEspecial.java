
public class ContaEspecial extends ContaBancaria
{
    private double limite;
    
    public ContaEspecial(String numero, double limite){
        this.limite = limite;
        setNumeroConta(numero);
    }
    
    @Override
    public boolean temSaldo(double valor)
    {
        return valor > 0 && valor <= (getSaldo()+limite);
    }
    
    
    public double getLimite(){
        return limite;
    }
}

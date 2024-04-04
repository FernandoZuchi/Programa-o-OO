
public class Poupanca extends ContaBancaria
{
    public Poupanca(String numero){

        setNumeroConta(numero);
    }
    
    public void rendimento(){
        
        double juros = getSaldo() * 0.01;
        depositar(juros);
    }
    
}

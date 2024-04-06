public class Taxista extends Funcionario
{
    private int kmRodado;
    private double valorKm;

    public Taxista()
    {
        super("");
    }
    
    public Taxista(String nome, int kmRodado, double valorKm)
    {
        super("");
        this.kmRodado = kmRodado;
        this.valorKm = valorKm;
    }
    
    public double salario(){
        return kmRodado * valorKm;
    }
}
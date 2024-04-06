public class Professor extends Funcionario
{
    private int numeroAula;
    private double valorHoraAula;
    
    public Professor(){
        super("");
    }
    
    public Professor(String nome, int numeroAula, double valorHoraAula)
    {
        super(nome);
        this.numeroAula = numeroAula;
        this.valorHoraAula = valorHoraAula;
    }
    
    @Override
    public double salario()
    {
        return numeroAula * valorHoraAula;
    }
    
    
}
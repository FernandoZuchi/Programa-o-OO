public class Quimico extends Funcionario implements Iinterface
{
    private double salario;
    
    public Quimico(String nome, double salario){
        super("");
        this.salario = salario;
    }
    
    public double salario(){
        return salario;
    }
    
    public double insalubridade(){
        return salario() * 0.10;
    }
}
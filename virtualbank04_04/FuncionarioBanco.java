
public class FuncionarioBanco
{
    private String nome;
    private double salario;
    private String certificaoCNPI;
    
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public double getSalario(){
        return this.salario;
    }
}

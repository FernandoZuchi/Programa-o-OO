//empresa
public class Empresa
{
    private String nome;
    private Funcionario[] funcionarios;
    
    public Empresa(){}
    public Empresa(String fnome){
        nome = fnome;
        funcionarios = new Funcionario[20];
    }
    
    public Funcionario funcionarioMaiorSalario(){
        if (funcionarios[0] == null){
           return null;   
        }
        Funcionario maior = funcionarios[0];
        for(int i = 1; i < funcionarios.length ; i++){
            if (funcionarios[i] != null){
                 if ( funcionarios[i].salarioLiquido() > maior.salarioLiquido() ){
                     maior = funcionarios[i];
                 }
            }
        }
        
        return maior;
    }
    
    public double somaSalarios(){
        double soma = 0;
        for(int i = 0; i < funcionarios.length ; i++){
            if (funcionarios[i] != null){
                soma += funcionarios[i].salarioLiquido();
            }
        }
        
        return soma;
    }
    
    public void setNome(String novoNome){
        nome = novoNome;
    }
    public String getNome(){
        return nome;
    }

    public Funcionario[] getFuncionario() {
        return funcionarios;
    }

    public void setFuncionario(Funcionario[], new Func) {
        funcionarios = newFunc;
    }
}
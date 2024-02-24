

public class Aluno
{
    // Atributos
    String nome;
    double nota;
    
    // Método Construtor
    public Aluno(String nomeAluno, double notaAluno){
        nome = nomeAluno;
        nota = notaAluno;
    }
    
    // Métodos
    public boolean estaAprovado(){
        
        // return (nota >= 7); outra solução
        
        if(nota >= 7){
            return true;
        }
        else{
            return false;
        }
        
    }
}

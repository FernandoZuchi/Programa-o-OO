import java.util.ArrayList;

public class Turma
{
    private ArrayList<Aluno> alunos;
    
    // Construtor da classe inicializa o array de alunos
    public Turma()
    {
        alunos = new ArrayList<>(); // Sempre que tem arraylist de classes será inicializado no método construtor     
    }
    
    // Método getter para pegar um aluno no arraylist da classe Aluno
    public ArrayList<Aluno> getAlunos()
    {
        return alunos;
    }
    
    // Método para adicionar(set) um objeto aluno ao arraylist de alunos
    public void addAluno(Aluno aluno)
    {
        alunos.add(aluno);
    }
    
    // Método para definir o aluno que será representante, ou o mais votado
    public Aluno representante()
    {
        Aluno maisVotado = alunos.get(0);
        for(Aluno aluno : alunos)
        {
            if(aluno.getVotos() > maisVotado.getVotos())
            {
                maisVotado = aluno;
            }
        }
        return maisVotado;
    }
}

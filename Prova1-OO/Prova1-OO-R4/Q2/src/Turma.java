import java.util.ArrayList;

public class Turma {
    private ArrayList<Aluno> alunos;

    public Turma()
    {
        this.alunos = new ArrayList<>();
    }

    public void addAlunos(Aluno aluno)
    {
        this.alunos.add(aluno);
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

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

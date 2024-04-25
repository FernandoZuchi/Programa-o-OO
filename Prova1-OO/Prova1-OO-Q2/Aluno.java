public class Aluno
{
    private int votos;
    private String nome;
    
    public Aluno(){}
    
    public Aluno(String nome)
    {
        this.nome = nome;
        this.votos = 0;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public int getVotos()
    {
        return votos;
    }
    
    public void fuiVotado()
    {
        votos++;
    }
}

public class Aluno
{
    private String nome;
    private int votos;
    
    public Aluno(String nome)
    {
        this.nome = nome;
        votos = 0;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public void setNome()
    {
        this.nome = nome;
    }
    
    public int getVotos()
    {
        return votos;
    }
    
    public int votado()
    {
        return votos++;
    }
}

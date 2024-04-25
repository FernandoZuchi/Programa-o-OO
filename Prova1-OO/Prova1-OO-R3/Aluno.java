public class Aluno
{
    private String nome;
    private int votos;
    
    public Aluno(String nome)
    {
        this.nome = nome;
        this.votos = 0;
    }
    
    public void setNome()
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
    
    public int votado()
    {
        return votos++;
    }
}

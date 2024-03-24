public class Cachorro
{
    private String nome;
    private int idade;
    private String raca;
    
    // Método construtor
    public Cachorro(String nome, int idade, String raca)
    {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }
    
    // Métodos de acesso
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public void setIdade(int idade)
    {
        this.idade = idade;
    }
    
    public int getIdade()
    {
        return idade;
    }
    
        public void setRaca(String nome)
    {
        this.nome = nome;
    }
    
    public String getRaca()
    {
        return nome;
    }

}
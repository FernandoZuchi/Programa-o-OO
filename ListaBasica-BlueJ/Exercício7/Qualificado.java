public class Qualificado
{
   private int idade, anosTrabalhados;
   
   // Métodos construtores
   public Qualificado(int idade, int anosTrabalhados)
    {
        this.idade = idade;
        this.anosTrabalhados = anosTrabalhados;
    }
    public Qualificado(){}
    
    // Método para verificar se está qualificado
    public void eQualificado()
    {
        if ((idade >= 65) || (anosTrabalhados >= 30) || (idade >= 60 && anosTrabalhados >= 25))
        {
            System.out.println("Qualificado");
        }
        else
        {
            System.out.println("Desqualificado!");
        };
    }
    
    // Métodos de acesso
    public void setIdade(int idade)
    {
        this.idade = idade;
    }
    
    public int getIdade()
    {
        return this.idade;
    }
    
    public void setAnosTrabalhados(int idade)
    {
        this.idade = idade;
    }
    
    public int getAnosTrabalhados()
    {
        return this.idade;
    }
    
}

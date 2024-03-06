public class Empregado {
    private int idade;
    private int anosTrabalhados;

    // Construtor da classe
    public Empregado(int idade, int anosTrabalhados)
    {
        this.idade = idade;
        this.anosTrabalhados = anosTrabalhados;
    }
    public void estaQualificado()
    {
        if ((idade >= 65) || (anosTrabalhados >= 30) || (idade >= 60 && anosTrabalhados >= 25))
        {
            System.out.println("Qualificado");
        }
        else
        {
            System.out.println("Desqualificado arrombado!");
        };
    }
}

// Ver se um empregado está qualificado para aposentadoria
// Ter no mínimo 65 anos de idade;
// Ter trabalhado no mínimo 30 anos.
// Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.

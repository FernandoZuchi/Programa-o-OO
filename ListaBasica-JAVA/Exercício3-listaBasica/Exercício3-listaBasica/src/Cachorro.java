public class Cachorro {
    private String nome;
    private int idade;
    private String raca;

    // Construtor da classe
    public Cachorro(String nome, int idade, String raca)
    {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }

    // Métodos de acessos (Nesse caso utilizamos apenas "getters")
    public String getNome()
    {
        return nome;
    }

    public int getIdade()
    {
        return idade;
    }

    public String getRaca()
    {
        return raca;
    }
}

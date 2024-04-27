import java.util.ArrayList;

public class Corredor {
    private String nome;
    private int idade;
    private Categoria categoria;

    private String matricula;

    private ArrayList<Corrida> corridas;

    public Corredor() {
    }

    public Corredor(String nome, int idade, Categoria categoria, String matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.categoria = categoria;
        corridas = new ArrayList<>();
    }

    public ArrayList<Corrida> getCorridas() {
        return corridas;
    }

    public void addCorrida(Corrida corrida) {
        this.corridas.add(corrida);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}

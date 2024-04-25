public class Aluno {
    private String nome;
    private int votos;

    public Aluno(){}

    public Aluno(String nome)
    {
        this.nome = nome;
        this.votos = 0;
    }

    public void fuiVotado()
    {
        votos++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

}

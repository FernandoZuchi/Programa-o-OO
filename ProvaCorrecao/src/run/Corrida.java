package run;

public class Corrida {
    private String nome;
    private String data;
    private int km;

    private int tempoMS;

    public Corrida() {
    }

    public Corrida(String nome, String data, int km, int tempoMS) {
        this.nome = nome;
        this.data = data;
        this.km = km;
        this.tempoMS = tempoMS;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getTempoMS() {
        return tempoMS;
    }

    public void setTempoMS(int tempoMS) {
        this.tempoMS = tempoMS;
    }
}

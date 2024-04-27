public class Categoria {
    private String descricao;
    private double bonus;

    public Categoria() {
    }

    public Categoria(String descricao, double bonus) {
        this.descricao = descricao;
        this.bonus = bonus;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}

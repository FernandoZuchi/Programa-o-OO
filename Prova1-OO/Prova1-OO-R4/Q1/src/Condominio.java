import java.util.ArrayList;

public class Condominio {
    private String nome;
    private String endereco;
    private ArrayList<Despesa> despesas;
    private ArrayList<Pagamento> pagamentos;
    private ArrayList<Imovel> imoveis;

    public Condominio(){}

    public Condominio(String nome, String endereco)
    {
        this.nome = nome;
        this.endereco = endereco;
        
    }

    public double valorCondominio(int mesAno)
    {
        double somaDespesas = 0.0;

        for(Despesa despesa : despesas)
        {
            if(despesa.getMesAno() == mesAno)
            {
                somaDespesas += despesa.getValor();
            }
        }
        return somaDespesas;
    }

    public String relatorio()
    {
        return "";
    }

    public void pagarCondominio(Imovel imovel, int mesAno)
    {
        Pagamento pagamento = new Pagamento();
        addPagamento(pagamento);
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Despesa> getDespesas() {
        return despesas;
    }

    public void addDespesa(Despesa despesa)
    {
        this.despesas.add(despesa);
    }

    public ArrayList<Imovel> getImoveis() {
        return imoveis;
    }

    public void addImovel(Imovel imovel)
    {
        this.imoveis.add(imovel);
    }

    public ArrayList<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public void addPagamento(Pagamento pagamento)
    {
        this.pagamentos.add(pagamento);
    }

}

import java.util.ArrayList;

public class Condominio {
    private String nome;
    private String endereco;
    private ArrayList<Despesa> despesas;
    private ArrayList<Imovel> imoveis;
    private ArrayList<Pagamento> pagamentos;

    public Condominio(){
        this("","");
    }

    public Condominio(String nome, String endereco)
    {
        this.nome =  nome;
        this.endereco = endereco;
        this.despesas = new ArrayList<>();
        this.imoveis = new ArrayList<>();
        this.pagamentos = new ArrayList<>();
    }

    public double valorCondominio(int mesAno)
    {
        double somaDespesas = 0;

        for(Despesa despesa : despesas)
        {
            if(despesa.getMesAno() == mesAno)
            {
                somaDespesas += despesa.getValor();
            }
        }
        return somaDespesas / imoveis.size();
    }

    public String relatorio(int mesAno)
    {
        int totalPg = totalPagamentos(mesAno);
        String relatorio = "";
        double valorCond = valorCondominio(mesAno);
        relatorio += "MÊS: " + mesAno + "\n";
        relatorio += imoveis.size() + "apartamentos ("+totalPg+" pagos - "+(imoveis.size() - totalPg)+" não pagos)";
        relatorio += "Valor arrecadados: R$ "+ (totalPg * valorCond)+" valor a ser pago R$ "+(imoveis.size() - totalPg) * valorCond;
        return relatorio;
    }

    public void pagarCondominio(Imovel imovel, int mesAno)
    {
        Pagamento pagamento = new Pagamento(mesAno, valorCondominio(mesAno), imovel, this);
        setPagamentos(pagamento);
    }

    public int totalPagamentos(int mesAno)
    {
        int totalPagos = 0;

        for(Pagamento pagamento : pagamentos)
        {
            if(pagamento.getMesAno() == mesAno)
            {
                totalPagos++;
            }
        }
        return totalPagos;
    }

    public ArrayList<Despesa> getDespesas() {
        return despesas;
    }

    public void setDespesas(Despesa despesa) {
        this.despesas.add(despesa);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setImoveis(Imovel imovel) {
        this.imoveis.add(imovel);
    }

    public ArrayList<Imovel> getImoveis() {
        return imoveis;
    }

    public ArrayList<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(Pagamento pagamento) {
        this.pagamentos.add(pagamento);
    }
}

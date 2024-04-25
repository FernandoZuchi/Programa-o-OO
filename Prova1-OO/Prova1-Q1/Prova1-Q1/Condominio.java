public class Condominio
{
    private String nome;
    private String endereco;
    private ArrayList<Despesa> despesas;
    
    public Condominio(String nome, String endereco)
    {
        this.nome = nome;
        this.endereco = endereco;
        despesas = new ArrayList<>();
    }
    
    // O método valorCondominio deve retorna soma das despesas do condomínio num mês/Ano.
    public double valorCondominio(int mesAno)
    {
        double valorCond = 0;
        for(Despesa despesa : despesas)
        {
            if(despesa.getMesAno() == mesAno)
            {
                valorCond += despesas.getValor();
            }
        }
        return valorCond;
    }
    
    // O método relatório deve imprimir a seguinte saída:
    // Mês: 01 - 2016
    // 30 apartamentos (18 pagos – 12 não pagos)
    // Valor arrecadados: R$ 8.000,00 valor a ser pago R$ 8.200,00
    public String relatorio(int mesAno)
    {
        int totalPg = totalPagamentos(mesAno);
        double valorCond = valorCondominio(mesAno);
        String relatorio = "Mes : " + mesAno + "\n";
        relatorio += imoveis.size() + "apartamentos ("+totalPg+
                    " pagos - "+(imoveis.size() - totalPg)+"não pagos)";
        relatorio += "Valor arrecadados: R$ "+(totalPg * valorCond)+
                    "valor a ser pago R$ "+(imoveis.size() - totalPg)*valorCond;
        return relatorio;
    }
    
    public void pagarCondominio(Imovel imovel, int mesAno)
    {
    
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public String getEndereco()
    {
        return endereco;
    }
    
    public void setNome(String endereco)
    {
        this.endereco = endereco;
    }
}

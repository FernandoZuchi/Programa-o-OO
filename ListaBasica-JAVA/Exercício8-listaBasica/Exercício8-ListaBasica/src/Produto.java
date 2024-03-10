public class Produto {
    private String nome;
    private String codigoDeBarras;
    private double preco;
    private int quantidadeEmEstoque;

    // Construtor
    public Produto(String nome, String codigoDeBarras, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.codigoDeBarras = codigoDeBarras;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    // Métodos get's e set's
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    // Método verificar
    public void disponivelEmEstoque()
    {
        if (quantidadeEmEstoque > 0) {
            System.out.println("Produto disponível");
        }
        else
        {
            System.out.println("Estoque vazio");
        }
    }

    // Método para exibir informações sobre o produto
    public void exibirInformacoes()
    {
        System.out.println("Nome: " + nome);
        System.out.println("Código de Barras: " + codigoDeBarras);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
    }

    // Método para atualizar a quantidade em estoque
    public void atualizarEstoque(int quantidade)
    {
        if (quantidadeEmEstoque >= quantidade) {
            quantidadeEmEstoque -= quantidade;
            System.out.println("Estoque  atualizado.");
        }
        else
        {
            System.out.println("Estoque insuficiente");
        }
    }
}

// verificar se o produto está disponível em estoque
// exibir algumas informações sobre o produto

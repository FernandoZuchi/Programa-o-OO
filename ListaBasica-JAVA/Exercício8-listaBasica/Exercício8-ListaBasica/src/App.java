public class App {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Camiseta", "123456789", 29.99, 10);
        Produto produto2 = new Produto("Tênis", "987654321", 129.99, 5);

        // Exibe informações
        produto1.exibirInformacoes();
        produto2.exibirInformacoes();

        // Verifica se está disponível em estoque
        produto1.disponivelEmEstoque();
        produto2.disponivelEmEstoque();

        produto1.atualizarEstoque(3);
    }
}

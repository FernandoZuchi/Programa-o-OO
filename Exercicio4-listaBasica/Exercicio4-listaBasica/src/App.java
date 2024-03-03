public class App {
    public static void main(String[] args) throws Exception {
        //Crie uma classe chamada "Retângulo" que represente um retângulo. Esta classe
        //deve ter os seguintes atributos: comprimento (double) e largura (double). Além disso, a
        //classe deve ter métodos para calcular a área e o perímetro do retângulo. Em seguida,
        //crie um programa principal que instancia objetos da classe "Retângulo", calcula a área
        //e o perímetro de cada um e exibe os resultados.
        Retangulo r1 = new Retangulo(12.0, 8.0);
        System.out.println("Retângulo 1:");
        System.out.println("Área: " + r1.calcularArea());
        System.out.println("Perímetro: " + r1.calcularPerimetro());
    }
}

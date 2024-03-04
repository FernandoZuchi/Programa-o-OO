public class App {
    public static void main(String[] args) throws Exception {
        // Instânciando objetos da classe cachorro
        Cachorro c1 = new Cachorro("Kyra",6, "Pastor Alemão");
        Cachorro c2 = new Cachorro("Vick",9,"Vira-lata");

        System.out.println("Cachorro 1: ");
        System.out.println("Nome: " + c1.getNome());
        System.out.println("Idade: " + c1.getIdade());
        System.out.println("Raça: " + c1.getRaca());

        System.out.println("\nCachorro 2: ");
        System.out.println("Nome: " + c2.getNome());
        System.out.println("Idade: " + c2.getIdade());
        System.out.println("Raça: " + c2.getRaca());
    }
}

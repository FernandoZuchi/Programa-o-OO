public class App {
    public static void main(String[] args) throws Exception {
        double [] pontoA = {5, 3}; 
        double [] pontoB = {8, 7}; 
        
        Calculadora calc1 = new Calculadora(); //Instânciando uma variável tipo Calculadora

        System.out.println(calc1.dist(pontoA, pontoB));
    }
}

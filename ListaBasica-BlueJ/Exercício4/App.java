import java.util.Scanner;

public class App
{
    public void main(String[] args)
    {   
        Scanner le = new Scanner(System.in);
        
        Retangulo r1 = new Retangulo();
        
        System.out.print("Informe a largura do retângulo: ");
        r1.setLargura(le.nextDouble());
        
        System.out.print("Informe o comprimento do retângulo: ");
        r1.setComprimento(le.nextDouble());
        
        System.out.print("A área do retângulo é de: "+r1.calculaArea()+"\n E o perímetro é de: "+r1.calculaPerimetro());
    }
}
import java.util.Scanner;

public class App
{
    public void main(String[] args)
    {
        
        Scanner le = new Scanner(System.in);
        Imprime impares = new Imprime();
        
        System.out.println("Insira o menor valor: ");
        int num1 = le.nextInt();
        System.out.println("Insira o maior valor: ");
        int num2 = le.nextInt();
        
        impares.imprimeImpares(num1,num2);
        
    }
}
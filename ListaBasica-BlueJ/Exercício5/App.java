import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        Scanner le = new Scanner(System.in);
        Triangulo t1 = new Triangulo();
        
        System.out.print("Informe o valor do 1° lado: ");
        t1.setLado1(le.nextDouble());
        System.out.print("Informe o valor do 2° lado: ");
        t1.setLado2(le.nextDouble());
        System.out.print("Informe o valor do 3° lado: ");
        t1.setLado3(le.nextDouble());
        
        System.out.println("Área: "+t1.area()+"\nPerímetro: "+t1.perimetro()+"\nSeu triângulo é isósceles: "+t1.isosceles()+"\nSeu triângulo é escaleno: "+t1.escaleno()+"\nSeu triângulo é equilátero: "+t1.equilatero());
    }
}

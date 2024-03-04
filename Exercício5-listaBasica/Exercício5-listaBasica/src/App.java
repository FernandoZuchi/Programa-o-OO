import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        //Crie um programa para ler os 3 lados de um triângulo, ao final imprima sua área, seu
        //perímetro e o tipo de triângulo. Isósceles, Escaleno ou Equilátero
        Scanner le = new Scanner(System.in);

        System.out.println("Digite o lado 1 do triângulo: ");
        double lado1 = le.nextDouble();
        System.out.println("Digite o lado 2 do triângulo: ");
        double lado2 = le.nextDouble();
        System.out.println("Digite o lado 3 do triângulo: ");
        double lado3 = le.nextDouble();
        
        Triangulo t1 = new Triangulo(lado1, lado2, lado3);
        System.out.println("Área: " + t1.area());
        System.out.println("Perímetro: " + t1.perimetro());
        t1.tipoTriangulo();
        le.close();
    }
}

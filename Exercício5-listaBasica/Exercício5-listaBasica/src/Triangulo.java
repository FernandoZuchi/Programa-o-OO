public class Triangulo {
    private double lado1, lado2, lado3;

    // Método construtor
    public Triangulo(double lado1, double lado2, double lado3)
    {
        setLado1(lado1);
        setLado2(lado2);
        setLado3(lado3);
    }

    // Método para verificar o tipo do triângulo
    public void tipoTriangulo()
    {
        if(eEquilatero())
        {
            System.out.println("Triângulo equilátero!");
        }
        else if (eEscaleno())
        {
            System.out.println("Triângulo escaleno!");
        }
        else
        {
            System.out.println("Triângulo isósceles");
        }
    }

    // Função para identificar tipo
    public boolean eEscaleno ()
    {
        return (lado1 != lado2 && lado1 != lado3 && lado2 != lado3);
    }

    // Função para identificar tipo
    public boolean eEquilatero ()
    {
        return (lado1 == lado2 && lado1 == lado3);
    }

    // Função para identificar tipo
    public boolean eIsosceles ()
    {
        return ((lado1 == lado2 && lado1 != lado3) || (lado1 != lado2 && lado1 == lado2));
    }

    // Método para identificar área do triângulo
    public double area()
    {
        double semiperimetro = (lado1 + lado2 + lado3);
        return Math.sqrt(semiperimetro * (semiperimetro - lado1) *  (semiperimetro - lado2) * (semiperimetro * lado3));
    }

    // Método para identificar perímetro do triângulo
    public double perimetro()
    {
        return lado1 + lado2 + lado3;
    }

    // Métodos de acesso
    public void setLado1(double novoLado)
    {
        this.lado1 = novoLado;
    }

    public void setLado2(double novoLado)
    {
        this.lado2 = novoLado;
    }

    public void setLado3(double novoLado)
    {
        this.lado3 = novoLado;
    }

    public double getLado1 ()
    {
        return this.lado1;
    }

    public double getLado2 ()
    {
        return this.lado1;
    }

    public double getLado3 ()
    {
        return this.lado1;
    }
}

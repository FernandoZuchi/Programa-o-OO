public class Triangulo
{
    double lado1, lado2, lado3;
    
    // Métodos construtores
    public Triangulo(){}
    public Triangulo(double lado1, double lado2, double lado3)
    {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    // Método para calcular área
    public double area()
    {
        double semiperimetro = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(semiperimetro * (semiperimetro - lado1) *  (semiperimetro - lado2) * (semiperimetro - lado3));
    }
    
    // Método para calcular o perímetro
    public double perimetro()
    {
        return lado1 + lado2 + lado3;
    }
    
    // Métodos para definir isósceles, equiláteros e escalenos
    public boolean equilatero()
    {
        return (lado1 == lado2 && lado2 == lado3 && lado3 == lado1);
    }
    
    public boolean escaleno()
    {
        return (lado1 != lado2 && lado2 != lado3 && lado3 != lado1);
    }
    
    public boolean isosceles()
    {
        return ((lado1 == lado2 && lado1 != lado3) || (lado1 != lado2 && lado2 == lado3));
    }
    
    
    // Métodos de acesso
    public void setLado1(double lado1)
    {
        this.lado1 = lado1;
    }
    
    public double getLado1()
    {
        return lado1;
    }
    
    public void setLado2(double lado2)
    {
        this.lado2 = lado2;
    }
    
    public double getLado2()
    {
        return lado2;
    }
    
    public void setLado3(double lado3)
    {
        this.lado3 = lado3;
    }
    
    public double getLado3()
    {
        return lado3;
    }
}
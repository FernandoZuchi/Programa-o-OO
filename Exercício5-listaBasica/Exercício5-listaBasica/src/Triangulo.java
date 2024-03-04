public class Triangulo {
    private double lado1, lado2, lado3;

    public Triangulo(double lado1, double lado2, double lado3)
    {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double area()
    {
        double semiperimetro = (lado1 + lado2 + lado3);
        return Math.sqrt(semiperimetro * (semiperimetro - lado1) *  (semiperimetro - lado2) * (semiperimetro * lado3));
    }

    public double perimetro()
    {
        return lado1 + lado2 + lado3;
    }
}

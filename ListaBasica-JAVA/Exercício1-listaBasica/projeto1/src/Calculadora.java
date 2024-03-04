public class Calculadora {
    public double dist(double [] pontoA, double[] pontoB)
    {
        return Math.sqrt(Math.pow(pontoB[0] - pontoA[0], 2) + Math.pow(pontoB[1] - pontoA[1], 2));
    }
}

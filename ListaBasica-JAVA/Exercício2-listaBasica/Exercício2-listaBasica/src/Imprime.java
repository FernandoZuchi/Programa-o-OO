public class Imprime {
    public void calcImpares(int n1, int n2)
    {
        for (int i = n1; i <= n2; i++)
        {
            if ( i % 2 != 0)
            {
                System.out.print(i  + " ");
            }
        }
    }
}

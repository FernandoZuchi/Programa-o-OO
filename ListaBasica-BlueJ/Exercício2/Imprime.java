
public class Imprime
{
    public void imprimeImpares(int num1, int num2){
        for(int i = num1; i < num2; i++)
        {
            if(i % 2 != 0)
            {
                System.out.println(i + "");
            }
        }
    }
}

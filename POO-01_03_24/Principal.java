import java.util.Scanner;

public class Principal
{
    public static void main(string[] args)
    {
        Empresa emp = new Empresa();
        // Classe predefinida para ler um dado do usuário
        Scanner read = new Scanner(System.in);

        Systen.out.println("Informe o nome da empresa: ");
        emp.setNome( read.next() );

        while(true)
        {
            System.out.println("Informe os dados do funcionário: ");
            Funcionario f = new Funcionario();
            System.out.println("## nome:");
            f.setNome( read.next() );
            System.out.println("## cargo:");
            f.setFuncao( read.next() );
            System.out.println("## Salario:");
            f.setSalario( read.nextDouble() );
            System.out.println("## Numero de filhos:");
            f.setNumeroFilhos( read.nextInt() );
            System.out.println("## Usa vale transporte:");
            f.setUsaValeTransporte( read.nextBoolean() );
            System.out.println("## Trabalha a noite:");
            f.setTrabalhaNoite( read.nextBoolean());
            if(f.getCargo().equals("vendedor"))
            {
                System.out.println("## Total vendas:");
                f.setTotalVendas( read.nextDouble());
            }

            
            emp.addFuncionario( f );
            System.out.println("Deseja cadastrar outro? (S) ou (N)");
            if (!read.next().equals("S"))
            {
                break;
            }

            break;
        }
        System.out.println("A empresa "+emp.getNome()+" paga R$ "+ emp.somaSalarios());

        System.out.println("Funcionario com Maior Salário: " + emp.funcionarioMaiorSalario().getNome());
    }
}
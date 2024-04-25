import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner le = new Scanner(System.in);

        Turma turma = new Turma();

        System.out.println("Informe o nome dos alunos da turma: ");
        for(int i = 0; i < 5; i++)
        {
            Aluno aluno = new Aluno(le.nextLine());
            turma.addAlunos(aluno);
        }
        
        System.out.println("Votação: ");
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Aluno "+turma.getAlunos().get(i).getNome()+ " informe seu voto: ");
            listaAlunos(turma.getAlunos());

            int voto = le.nextInt();

            turma.getAlunos().get(voto).fuiVotado();
        }

        System.out.println("O novo representante é: "+ turma.representante().getNome());
    }

    public static void listaAlunos(ArrayList<Aluno> alunos)
    {
        int i = 0;
        for(Aluno aluno : alunos)
        {
            System.out.println("## Aluno "+ (i++) + " - " + aluno.getNome());
        }
    }
}

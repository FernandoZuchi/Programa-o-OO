import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Scanner le = new Scanner(System.in);
        Turma turma = new Turma();
        
        System.out.println("Informe o nome do aluno(a): ");
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Aluno " + i);
            Aluno aluno = new Aluno(le.next());
            turma.addAluno(aluno);
        }
        
        System.out.println("Início da votação: ");
        for(int i = 0; i < 5; i++)
        {
            System.out.println("## " + turma.getAlunos().get(i).getNome() + "escolha um dos candidatos");
            listaCandidatos(turma.getAlunos());
            
            int voto = le.nextInt();
            
            turma.getAlunos().get(voto).votado();
        }
        
        System.out.println("O representante é: " + turma.representante().getNome());
    }
    
    public static void listaCandidatos(ArrayList<Aluno> alunos)
    {
        int i = 0;
        for(Aluno aluno : alunos)
        {
            System.out.println("## Candidato: " + (i++) + " - ");
        }
    }
}

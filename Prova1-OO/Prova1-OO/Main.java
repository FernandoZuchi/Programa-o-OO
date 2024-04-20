public class Main
{
    public static void main(String[] args)
    {
        Scanner le = new Scanner(System.in);
        
        Turma turma = new Turma();
        System.out.println("Data da Votacao?");
        turma.setDataVotacao(le.next());
        
        System.out.println("Alunos da Turma?");
        for(int i = 0; i < 5; i++)
        {
            System.out.println("# Aluno " + i);
            Aluno a = new Aluno(le.next());
            turma.addAluno(a);
        }
        
        System.out.println("Inicio da votação");
        for(int i = 0; i < 5; i++)
        {
            System.out.println("## " + turma.getAlunos().get(i).getNome() + " escolha um dos candidatos");
            listaCandidatos(turma.getAlunos()); 
            
            int voto = le.nextInt();
            
            turma.getAlunos().get(voto).fuiVotado();
        }
        
        System.out.println("O novo representante é " + turma.representante().getNome());
    }
    
    public void listaCandidatos(ArrayList<Aluno> alunos)
    {
        int i = 0;
        for (Aluno a : alunos)
        {
            System.out.println("### Candidadto " + (i++) + " - ");
        }
    }
}

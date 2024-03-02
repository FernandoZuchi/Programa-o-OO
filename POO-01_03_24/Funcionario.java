public class Funcionario
{
    //atributos
    private String nome, funcao;
    private double salario, totalVendas;
    private boolean trabalhaNoite, usaValeTransporte;
    private int numeroFilhos;
    //private Empresa empresa;
    //Metodos Construtores
    public Funcionario(){}
    public Funcionario(String fnome,String ffuncao,
    double fsalario, double ftotalVendas,
    boolean ftrabalhaNoite, boolean fusaValeTransporte, int fnumeroFilhos){
        nome = fnome;
        funcao = ffuncao;
        salario = fsalario;
        totalVendas = ftotalVendas;
        trabalhaNoite = ftrabalhaNoite;
        usaValeTransporte = fusaValeTransporte;
        numeroFilhos = fnumeroFilhos;
        
    }
    
    public double inss(){
        return salario * 0.13;
    }    
    public double bonusGerente(){
        return (funcao.toUpperCase().equals("gerente".toUpperCase()))? salario * 0.1 : 0 ;
    }  
    public double bonusVendedor(){
        return (funcao.toUpperCase().equals("vendedor".toUpperCase()))? totalVendas *0.02 : 0 ;
    }
    public double descontoValeTransporte(){
        return (usaValeTransporte)? (salario *0.03) : 0 ; 
    }
    public double bonusTrabalhadorNoturno(){
        return (trabalhaNoite)? (salario *0.02) : 0 ; 
    }
    public double bonusPorFilho(){
        return (numeroFilhos < 3)? numeroFilhos*50 : 150 ; 
    }
    
    public double salarioLiquido(){        
        return salario - inss() + bonusGerente() + bonusVendedor() 
        - descontoValeTransporte() + bonusTrabalhadorNoturno() + bonusPorFilho();
    }
    
    //Metodos de Acesso
}
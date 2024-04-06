public class Enfermeiro extends Funcionario implements Iinterface
{
    private double salarioFixo;
    private int plantoes;
    private double valorPlantao;
    
    public Enfermeiro(){
        super("");
    }
    
    public Enfermeiro(String nome, int plantoes, double valorPlantao, double salarioFixo)
    {
        super("");
        this.plantoes = plantoes;
        this.valorPlantao = valorPlantao;
        this.salarioFixo = salarioFixo;
    }
    
    public double salario()
    {
        return plantoes * valorPlantao;
    }
    
    public double insalubridade(){
        return salario() * 0.10;
    }
    
    public double contribuicaoSindical(){
        return salario() * 0.10;
    }
}
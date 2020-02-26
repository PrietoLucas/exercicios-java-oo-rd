package exercicio02;

public class TecnicoManutencao extends Funcionario{
    public double bonus;
    public double insalubridade;
    public double pcInsalu;

    public TecnicoManutencao(String nome, double salarioM, double pcInsalu, double bonus) {
        super();
    }

    @Override
    public void salarioA(String nome, double salarioM) {
        super.salarioA(nome, salarioM);
        
        insalubridade=salarioM*pcInsalu;

        salarioAnual=(salarioM*13)+insalubridade+bonus;

        System.out.println(nome+" Recebe: "+salarioAnual);
    }
}

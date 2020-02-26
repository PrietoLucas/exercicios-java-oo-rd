package exercicio02;

public class Gerente extends Funcionario{
    public double bonusG;
    public double percB;

    public Gerente(String nome, double salarioM, double percB) {
        super();
    }

    @Override
    public void salarioA(String nome, double salarioM) {
        super.salarioA(nome, salarioM);

        bonusG=salarioM*percB;

        salarioAnual=(salarioM*13)+bonusG;

        System.out.println(nome+" Recebe: "+salarioAnual);
    }
}

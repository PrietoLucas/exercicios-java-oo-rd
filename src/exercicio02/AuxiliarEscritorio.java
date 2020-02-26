package exercicio02;

public class AuxiliarEscritorio extends Funcionario{
    public double bonus;

    public AuxiliarEscritorio(String nome, double salarioM, double bonus) {
        super();
    }

    Funcionario funcionario = new Funcionario() {
        @Override
        public void salarioA(String nome, double salarioM) {
            super.salarioA(nome, salarioM);

            salarioAnual=(salarioM*13)+bonus;

            System.out.println(nome+" Recebe: "+salarioAnual);
        }
    };
}

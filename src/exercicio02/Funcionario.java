package exercicio02;

public abstract class Funcionario {

    public String nome;
    public double salarioM;
    public double salarioAnual;

    public void salarioA(String nome, double salarioM){
        salarioAnual = salarioM * 13;
        System.out.println(nome+" Recebe: "+salarioAnual+" anuais.");
    }
}

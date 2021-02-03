package funcionarios;

public class Atendente extends Funcionario{
    public Atendente(int salario, String nome) {
        super(salario, nome);
    }

    @Override
    public double imposto() {
        return salario * 0.01;
    }
}

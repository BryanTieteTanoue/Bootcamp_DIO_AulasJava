package funcionarios;

public class Supervisor extends Funcionario{
    public Supervisor(int salario, String nome) {
        super(salario, nome);
    }

    @Override
    public double imposto() {
        return salario * 0.05;
    }
}

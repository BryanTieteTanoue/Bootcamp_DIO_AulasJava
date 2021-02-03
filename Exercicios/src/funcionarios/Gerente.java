package funcionarios;

public class Gerente extends Funcionario{

    public Gerente(int salario, String nome) {
        super(salario, nome);
    }

    @Override
    public double imposto() {
        return salario * 0.1;
    }
}

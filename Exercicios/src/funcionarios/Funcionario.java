package funcionarios;

public class Funcionario {

    protected int salario;
    protected String nome;

    public Funcionario(int salario, String nome) {
        this.salario = salario;
        this.nome = nome;
    }

    public double imposto(){
        return salario;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + " | Salário: " + salario;
    }

}

package funcionarios;

public class ProgramaFuncs {

    public static void main(String[] args){

        Funcionario func = new Funcionario(1000, "Flávio");
        Gerente geren = new Gerente(1000, "Gabriel");
        Supervisor superv = new Supervisor(1000, "Sandra");
        Atendente atend = new Atendente(1000, "Alice");

        System.out.println(func.imposto());
        System.out.println(geren.imposto());
        System.out.println(superv.imposto());
        System.out.println(atend.imposto());

    }

}

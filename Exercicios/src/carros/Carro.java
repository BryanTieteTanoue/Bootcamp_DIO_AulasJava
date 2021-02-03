package carros;

public class Carro {

    private int limitePessoas;
    private int pessoasDentro;
    private String marca;
    private String modelo;
    private int ano;
    private String variante;

    /* //Exercicio 1
    public carros.Carro(int limitePessoas){
        this.limitePessoas = limitePessoas;
        this.pessoasDentro = 0;
    }*/

    public Carro(String modelo, String marca, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    public Carro(String modelo, String marca, int ano,
                 int limitePessoas, String variante) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.limitePessoas = limitePessoas;
        this.pessoasDentro = 0;
        this.variante = variante;
    }

    public int getLimitePessoas(){
        return limitePessoas;
    }

    public int getPessoasDentro(){
        return pessoasDentro;
    }

    public void adcionarPessoas(){
        if ( !(pessoasDentro == limitePessoas))
            pessoasDentro++;
        else {
            System.out.println("Não cabe mais peesoas");
        }
    }

    public void retirarPessoas(){
        if ( !(pessoasDentro == 0))
            pessoasDentro--;
        else {
            System.out.println("Não peesoas dentro para sair");
        }
    }

}

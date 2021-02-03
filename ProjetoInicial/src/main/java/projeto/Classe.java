package projeto;

public class Classe{

    public static void main(String[] args){
        System.out.println("Hello world");

        int num = 30000;
        Integer num2 = 1354;    //Wrappers

        String str = "Olá pessoal";

        Void v;     //tipo váilido, mas vazio

        Number num3 = 1645156;

        //Integer num4 = "321321";    //tipagem estática, compila em tempo de execução, não da para colocar String em núemro

        /* Tipagem forte, não pode mudar o tipo de variáveis
        String text = "Uma string";
        text = 100;
        */
        //a partir do Jva 10 podemos usar "var" e o compilador irá inferir qual o tipo
        var numero2 = Integer.valueOf("1234");
        var texto = "O número é: ";

        System.out.println(texto + numero2);

    }

}

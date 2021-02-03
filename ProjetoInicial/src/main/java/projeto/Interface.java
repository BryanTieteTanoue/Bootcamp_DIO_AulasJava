package projeto;

public interface Interface {

    //Interfaces permitem heramça múltipla
    //Interfaces podem extender (herança) outras interfaces

     default void print() { //podemos fazer métodos default, eles  tem "corpo"
        System.out.println("interface");
    }

     public int soma(int a, int b);

}

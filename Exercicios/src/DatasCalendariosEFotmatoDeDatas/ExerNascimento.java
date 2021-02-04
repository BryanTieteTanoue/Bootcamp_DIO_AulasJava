package DatasCalendariosEFotmatoDeDatas;

import java.util.Date;

public class ExerNascimento {

    public static void main(String[] args){
        Date aniversario = new Date(966470400000l);
        //https://www.epochconverter.com/   link para obter o milisegundos
        Date data = new Date(1273881600000l);


        boolean isBefore = aniversario.before(data);
        boolean isAfter = aniversario.after(data);

        System.out.println("O seu aniversário é antes: " + isBefore);
        System.out.println("O seu aniversário é depois: " + isAfter);
    }

}

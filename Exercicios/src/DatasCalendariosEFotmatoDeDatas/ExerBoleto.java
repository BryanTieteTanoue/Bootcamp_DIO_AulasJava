package DatasCalendariosEFotmatoDeDatas;

import java.util.Calendar;

public class ExerBoleto {

    public static void main(String[] args){
        Calendar data = Calendar.getInstance();

        System.out.printf("Hoje é dia %tc \n", data.getTime());
        data.add(Calendar.DATE, 10);
        int weekDay = data.get(Calendar.DAY_OF_WEEK);

        switch(weekDay) {
            case (7): //verifica se é sábado
                data.add(Calendar.DATE, 2);
                break;
            case (1): //verifica se é domingo
                data.add(Calendar.DATE, 1);
                break;
        }

        System.out.printf("Você tem até o dia %tc  \n", data.getTime());

    }




}

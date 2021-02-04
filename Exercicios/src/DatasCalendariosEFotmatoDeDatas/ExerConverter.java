package DatasCalendariosEFotmatoDeDatas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExerConverter {

    public static void main(String[] args){
        Date dataAtual = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY HH:MM:SS:MMM");
        String str = sdf.format(dataAtual);

        System.out.println(str);
    }



}

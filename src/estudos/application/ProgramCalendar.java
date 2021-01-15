package estudos.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class ProgramCalendar {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date date = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        System.out.println(sdf.format(date));

        // Instancia o Calendar
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        //Saber quantos minutos e mês tem no Calendar
        int minutes = calendar.get(Calendar.MINUTE);
        System.out.println("Minutos: " + minutes);

        int month = 1 + calendar.get(Calendar.MONTH);
        System.out.println("Mês: " + month);

        // Adiciona o horario no calendario
        calendar.add(Calendar.HOUR_OF_DAY , 4);
        date = calendar.getTime();

        System.out.println(sdf.format(date));



    }
}

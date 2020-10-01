package eu.imninja.dostuffweb.DateFormatter;

import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

@Component
public class DateFormatter {

    public Date formatDate(String date) throws ParseException {

        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(date.replace("T", " ") + ":00");

    }

    public Date formatDateWithShift(String date,int days) throws ParseException {

        String timestring = date.toString().substring(10,date.length());

        LocalDate nextWeek = LocalDate.now().plusDays(1);
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(nextWeek.toString() + " " + timestring);

    }
}

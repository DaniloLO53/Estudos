package study.viradonojiraya.day11.UtilityClasses;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT");
        Calendar calendar = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
//        System.out.println(df1.format(calendar.getTime()));
        System.out.println(Locale.getDefault());
    }
}

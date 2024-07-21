package training.locale;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class LocaleTraining {
    public static void main(String[] args) {
        Locale localeUs = Locale.US;
        Locale localeFr = Locale.FRANCE;

        NumberFormat currencyFormatterUs = NumberFormat.getCurrencyInstance(localeUs);
        NumberFormat currencyFormatterFr = NumberFormat.getCurrencyInstance(localeFr);

        double amount = 1234.56;

        System.out.println("US: " + currencyFormatterUs.format(amount));
        System.out.println("FR: " + currencyFormatterFr.format(amount));

        System.out.println("\n\n");

        DateFormat dateFormatterUs = DateFormat.getDateInstance(DateFormat.LONG, localeUs);
        DateFormat dateFormatterFr = DateFormat.getDateInstance(DateFormat.LONG, localeFr);

        Date date = new Date();
        System.out.println("US: " + dateFormatterUs.format(date));
        System.out.println("Fr: " + dateFormatterFr.format(date));

        System.out.println("\n\n");
        Locale sw = new Locale("ch", "CH");
        System.out.println(sw.getDisplayLanguage());
        System.out.println(sw.getLanguage());
    }
}

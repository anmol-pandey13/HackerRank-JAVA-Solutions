
import java.util.*;
import java.text.*;

public class Java_Currency_Formatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();

        // US currency
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);

        // Indian currency
        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);

        // Chinese currency
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);

        // French currency
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));

        scanner.close();
    }
}


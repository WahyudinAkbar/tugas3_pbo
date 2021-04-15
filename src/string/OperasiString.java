package string;

import java.util.Locale;

public class OperasiString {
    public static void main(String[] args) {
        String kota = "Kandangan";

        System.out.println(kota);

        char[] wahyuChar = { 'W', 'A', 'H', 'Y', 'U'};
        String wahyuString = new String(wahyuChar);
        System.out.println(wahyuString);

        System.out.println(kota.toUpperCase());
        System.out.println(kota.toLowerCase());
        System.out.println(kota.substring(5));
        System.out.println(kota.substring(0,4));
    }
}

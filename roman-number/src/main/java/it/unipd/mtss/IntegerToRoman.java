////////////////////////////////////////////////////////////////////
// INES IADADI 2113175
// ANGELA MAULE 2110991
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        if (number <= 0 || number > 1000) {
            throw new IllegalArgumentException("Valore errato: non nel range 1-1000");
        }

        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = 
            {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = 
            {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] units = 
            {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return thousands[number / 1000] +
               hundreds[(number % 1000) / 100] +
               tens[(number % 100) / 10] +
               units[number % 10];
    }
}
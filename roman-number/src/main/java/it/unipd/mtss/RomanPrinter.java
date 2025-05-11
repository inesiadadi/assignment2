////////////////////////////////////////////////////////////////////
// INES IADADI 2113175
// ANGELA MAULE 2110991
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        String[] ascii = new String[6];
        for (int i = 0; i < 6; i++) {
            ascii[i] = "";
        }

        for (char c : romanNumber.toCharArray()) {
            String[] letterAscii = getAscii(c);
            for (int i = 0; i < 6; i++) {
                ascii[i] += letterAscii[i] + "  ";
            }
        }

        StringBuilder result = new StringBuilder();
        for (String line : ascii) {
            result.append(line).append("\n");
        }

        return result.toString();
    }

    private static String[] getAscii(char c) {
        switch (c) {
            case 'I':
                return new String[]{
                    " _____ ",
                    "|_   _|",
                    "  | |  ",
                    "  | |  ",
                    " _| |_ ",
                    "|_____|"
                };
            case 'V':
                return new String[]{
                    "__      __",
                    "\\ \\    / /",
                    " \\ \\  / / ",
                    "  \\ \\/ /  ",
                    "   \\  /   ",
                    "    \\/    "
                };
            case 'X':
                return new String[]{
                    "__   __",
                    "\\ \\ / /",
                    " \\ V / ",
                    "  > <  ",
                    " / . \\ ",
                    "/_/ \\_\\"
                };
            case 'L':
                return new String[]{
                    " _      ",
                    "| |     ",
                    "| |     ",
                    "| |     ",
                    "| |____ ",
                    "|______|"
                };
            case 'C':
                return new String[]{
                    "  _____ ",
                    " / ____|",
                    "| |     ",
                    "| |     ",
                    "| |____ ",
                    " \\_____|"
                };
            case 'D':
                return new String[]{
                    " _____  ",
                    "|  __ \\ ",
                    "| |  | |",
                    "| |  | |",
                    "| |__| |",
                    "|_____/ "
                };
            case 'M':
                return new String[]{
                    " __  __ ",
                    "|  \\/  |",
                    "| \\  / |",
                    "| |\\/| |",
                    "| |  | |",
                    "|_|  |_|"
                };
            default:
                throw new IllegalArgumentException("Carattere romano non valido: " + c);
        }
    }
}
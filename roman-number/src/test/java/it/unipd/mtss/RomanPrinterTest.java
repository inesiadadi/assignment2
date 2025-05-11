package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.*;

public class RomanPrinterTest {

    @Test
    public void testPrintMinimumInput() {
        String expected = 
            " _____   \n" +
            "|_   _|  \n" +
            "  | |    \n" +
            "  | |    \n" +
            " _| |_   \n" +
            "|_____|  \n";
        String result = RomanPrinter.print(1);
        assertEquals(expected, result);
    }

    @Test
    public void testPrintMaximumInput() {
        String expected = 
            " __  __   \n" +
            "|  \\/  |  \n" +
            "| \\  / |  \n" +
            "| |\\/| |  \n" +
            "| |  | |  \n" +
            "|_|  |_|  \n";
        String result = RomanPrinter.print(1000);
        assertEquals(expected, result);
    }

    @Test
    public void testPrintV() {
        String expected = 
            "__      __  \n" +
            "\\ \\    / /  \n" +
            " \\ \\  / /   \n" +
            "  \\ \\/ /    \n" +
            "   \\  /     \n" +
            "    \\/      \n";

        String result = RomanPrinter.print(5);
        assertEquals(expected, result);
    }

    @Test
    public void testPrintIII() {
        String expected = 
            " _____    _____    _____   \n" +
            "|_   _|  |_   _|  |_   _|  \n" +
            "  | |      | |      | |    \n" +
            "  | |      | |      | |    \n" +
            " _| |_    _| |_    _| |_   \n" +
            "|_____|  |_____|  |_____|  \n";
        String result = RomanPrinter.print(3);
        assertEquals(expected, result);
    }

    @Test
    public void testPrintXVI() {
        String expected = 
            "__   __  __      __   _____   \n" +
            "\\ \\ / /  \\ \\    / /  |_   _|  \n" +
            " \\ V /    \\ \\  / /     | |    \n" +
            "  > <      \\ \\/ /      | |    \n" +
            " / . \\      \\  /      _| |_   \n" +
            "/_/ \\_\\      \\/      |_____|  \n";
        String result = RomanPrinter.print(16);
        assertEquals(expected, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintZeroThrowsException() {
        RomanPrinter.print(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintOver1000ThrowsException() {
        RomanPrinter.print(1001);
    }


    @Test(expected = IllegalArgumentException.class)
    public void testPrint_NegativeNumberThrowsException() {
        RomanPrinter.print(-5);
    }
}

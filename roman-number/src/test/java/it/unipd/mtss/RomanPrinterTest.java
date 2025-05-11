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
    public void testPrintL() {
        String expected = 
            " _        \n"+
            "| |       \n"+
            "| |       \n"+
            "| |       \n"+
            "| |____   \n"+
            "|______|  \n";
        String result = RomanPrinter.print(50);
        assertEquals(expected, result);
    }

    @Test
    public void testPrintC() {
        String expected = 
            "  _____   \n"+
            " / ____|  \n"+
            "| |       \n"+
            "| |       \n"+
            "| |____   \n"+
            " \\_____|  \n";
        String result = RomanPrinter.print(100);
        assertEquals(expected, result);
    }

    @Test
    public void testPrintD() {
        String expected = 
            " _____    \n"+
            "|  __ \\   \n"+
            "| |  | |  \n"+
            "| |  | |  \n"+
            "| |__| |  \n"+
            "|_____/   \n";
        String result = RomanPrinter.print(500);
        assertEquals(expected, result);
    }

    @Test
    public void testPrintMultipleNumber() {
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
        String expectedMessage = "Valore errato: non nel range 1-1000";
        try {
            RomanPrinter.print(0);
        } catch (IllegalArgumentException e) {
            assertEquals(expectedMessage, e.getMessage());
            throw e;
        }
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

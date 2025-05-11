package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.*;

public class IntegerToRomanTest {

    @Test
    public void testConvertReturnIWhenInput1() {
        int input = 1;
        String result = IntegerToRoman.convert(input);
        assertEquals("I", result);
    }

    @Test
    public void testConvertReturnMWhenInput1000() {
        int input = 1000;
        String result = IntegerToRoman.convert(input);
        assertEquals("M", result);
    }

    @Test
    public void testConvertSimpleConversions() {
        assertEquals("IV", IntegerToRoman.convert(4));
        assertEquals("X", IntegerToRoman.convert(10));
    }

    @Test
    public void testConvertComplexConversions() {
        assertEquals("XLIV", IntegerToRoman.convert(44));
        assertEquals("CMXCIX", IntegerToRoman.convert(999));
    }

    @Test
    public void testConvertContainAllLetterTypesWhenInput888() {
        String result = IntegerToRoman.convert(888);
        assertTrue(result.contains("D") && result.contains("C") && 
                result.contains("L") && result.contains("X") && 
                result.contains("V") && result.contains("I"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertZeroThrowsException() {
        IntegerToRoman.convert(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertNegativeThrowsException() {
        IntegerToRoman.convert(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertTooLargeThrowsException() {
        IntegerToRoman.convert(1001);
    }
}

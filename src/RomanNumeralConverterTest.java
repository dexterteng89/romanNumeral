import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RomanNumeralConverterTest {

    @Test
    public void testShouldReturnIForIntInputOne() {
        assertEquals("I", new RomanNumeralConverter().toRomanNumeral(1));
    }

    @Test
    public void testShouldReturnIIForIntInputTwo() {
        assertEquals("II", new RomanNumeralConverter().toRomanNumeral(2));
    }

    @Test
    public void testShouldReturnIIIForIntInputThree() {
        assertEquals("III", new RomanNumeralConverter().toRomanNumeral(3));
    }

    @Test
    public void testShouldReturnIVForIntInputFour() {
        assertEquals("IV", new RomanNumeralConverter().toRomanNumeral(4));
    }

    @Test
    public void testShouldReturnVForIntInputFive() {
        assertEquals("V", new RomanNumeralConverter().toRomanNumeral(5));
    }

    @Test
    public void testShouldReturnVIForIntInputSix() {
        assertEquals("VI", new RomanNumeralConverter().toRomanNumeral(6));
    }

    @Test
    public void testShouldReturnVIIForIntInputSeven() {
        assertEquals("VII", new RomanNumeralConverter().toRomanNumeral(7));
    }

    @Test
    public void testShouldReturnVIIIForIntInputEight() {
        assertEquals("VIII", new RomanNumeralConverter().toRomanNumeral(8));
    }

    @Test
    public void testShouldReturnIXForIntInputNine() {
        assertEquals("IX", new RomanNumeralConverter().toRomanNumeral(9));
    }

    @Test
    public void testShouldReturnXForIntInputTen() {
        assertEquals("X", new RomanNumeralConverter().toRomanNumeral(10));
    }


}

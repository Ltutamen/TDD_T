import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import ua.axiom.RomanNumeral;

public class RomanNumeralTests {
    private static RomanNumeral romanNumeral;

    @BeforeClass
    public static void setUpBeforeClass() {
        romanNumeral = new RomanNumeral();
    }

    @Test
    public void testIntToRoman_1_is_I() {
        Assert.assertEquals(romanNumeral.intToRoman(1), "I");
    }

    @Test
    public void testIntToRoman_2_is_II() {
        Assert.assertEquals(romanNumeral.intToRoman(2), "II");
    }

    @Test
    public void testInToRoman_10_is_X() {
        Assert.assertEquals(romanNumeral.intToRoman(10), "X");
    }

    @Test
    public void testInToRoman_13_is_X() {
        Assert.assertEquals(romanNumeral.intToRoman(13), "XIII");
    }

    @Test
    public void testInToRoman_15_is_X() {
        Assert.assertEquals(romanNumeral.intToRoman(15), "XV");
    }
}

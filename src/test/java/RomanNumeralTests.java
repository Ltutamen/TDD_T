import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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
}

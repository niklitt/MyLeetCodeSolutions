import org.litt.romanToInteger.Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class RomanToIntegerTest {

    @Test
    public void RomanToIntegerLVIII() {
        String romanValue = "LVIII";
        System.out.println("romanValue is: " + romanValue);
        int actual = Solution.romanToInt(romanValue);
        System.out.println("actual is: " + actual);
        int expected = 58;
        System.out.println("expected is: " + expected);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void RomanToIntegerIII() {
        String romanValue = "III";
        System.out.println("romanValue is: " + romanValue);
        int actual = Solution.romanToInt(romanValue);
        System.out.println("actual is: " + actual);
        int expected = 3;
        System.out.println("expected is: " + expected);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void RomanToIntegerMCMXCIV() {
        String romanValue = "MCMXCIV";
        System.out.println("romanValue is: " + romanValue);
        int actual = Solution.romanToInt(romanValue);
        System.out.println("actual is: " + actual);
        int expected = 1994;
        System.out.println("expected is: " + expected);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void RomanToIntegerXLIX() {
        String romanValue = "XLIX";
        System.out.println("romanValue is: " + romanValue);
        int actual = Solution.romanToInt(romanValue);
        System.out.println("actual is: " + actual);
        int expected = 49;
        System.out.println("expected is: " + expected);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void RomanToIntegerLI() {
        String romanValue = "LI";
        System.out.println("romanValue is: " + romanValue);
        int actual = Solution.romanToInt(romanValue);
        System.out.println("actual is: " + actual);
        int expected = 51;
        System.out.println("expected is: " + expected);
        Assert.assertEquals(actual, expected);
    }
}
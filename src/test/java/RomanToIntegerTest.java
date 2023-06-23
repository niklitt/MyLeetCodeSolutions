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
}
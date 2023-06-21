import org.litt.zigzagConversion.Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ZigzagConversionTest {


    @Test
    public void Zigzag1() {
        String input = "PAYPALISHIRING";
        int numRows = 1;
        System.out.println("input is: " + input);
        System.out.println("numRows is: " + numRows);
        String expected = "PAYPALISHIRING";
        System.out.println("expected is: " + expected);
        String actual = Solution.convert(input, numRows);
        System.out.println("actual is: " + actual);
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void Zigzag2() {
        String input = "PAYPALISHIRING";
        int numRows = 2;
        System.out.println("input is: " + input);
        System.out.println("numRows is: " + numRows);
        String expected = "PYAIHRNAPLSIIG";
        System.out.println("expected is: " + expected);
        String actual = Solution.convert(input, numRows);
        System.out.println("actual is: " + actual);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void Zigzag3() {
        String input = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println("input is: " + input);
        System.out.println("numRows is: " + numRows);
        String expected = "PAHNAPLSIIGYIR";
        System.out.println("expected is: " + expected);
        String actual = Solution.convert(input, numRows);
        System.out.println("actual is: " + actual);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void Zigzag4() {
        String input = "PAYPALISHIRING";
        int numRows = 4;
        System.out.println("input is: " + input);
        System.out.println("numRows is: " + numRows);
        String expected = "PINALSIGYAHRPI";
        System.out.println("expected is: " + expected);
        String actual = Solution.convert(input, numRows);
        System.out.println("actual is: " + actual);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void Zigzag5() {
        String input = "PAYPALISHIRING";
        int numRows = 5;
        System.out.println("input is: " + input);
        System.out.println("numRows is: " + numRows);
        String expected = "PHASIYIRPLIGAN";
        System.out.println("expected is: " + expected);
        String actual = Solution.convert(input, numRows);
        System.out.println("actual is: " + actual);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void Zigzag6() {
        String input = "PAYPALISHIRING";
        int numRows = 6;
        System.out.println("input is: " + input);
        System.out.println("numRows is: " + numRows);
        String expected = "PRAIIYHNPSGAIL";
        System.out.println("expected is: " + expected);
        String actual = Solution.convert(input, numRows);
        System.out.println("actual is: " + actual);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void Zigzag7() {
        String input = "PAYPALISHIRING";
        int numRows = 7;
        System.out.println("input is: " + input);
        System.out.println("numRows is: " + numRows);
        String expected = "PNAIGYRPIAHLSI";
        System.out.println("expected is: " + expected);
        String actual = Solution.convert(input, numRows);
        System.out.println("actual is: " + actual);
        Assert.assertEquals(actual,expected);
    }

}

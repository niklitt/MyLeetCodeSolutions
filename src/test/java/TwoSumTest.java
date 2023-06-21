import org.litt.twoSum.Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class TwoSumTest {

    @Test
    public void TwoSumEasy() {
        int[] nums = {2,7,11,15};
        System.out.println("input is: " + Arrays.toString(nums));
        int[] expected = {0,1};
        System.out.println("expected is: " + Arrays.toString(expected));
        int[] actual = Solution.twoSum(nums, 9);
        System.out.println("actual is: " + Arrays.toString(actual));
        Assert.assertEquals(actual,expected);
    }
}

import org.litt.threeSum.Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumTest {

    @Test
    public void ThreeSumNormal() {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println("input is: " + Arrays.toString(nums));
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-1,-1,2),Arrays.asList(-1,0,1));
        System.out.println("expected is: " + expected);
        List<List<Integer>> actual = Solution.threeSum(nums);
        System.out.println("actual is: " + actual);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void ThreeSumEmpty() {
        int[] nums = {0,1,1};
        System.out.println("input is: " + Arrays.toString(nums));
        List<List<Integer>> expected = new ArrayList<>(new ArrayList<>());
        System.out.println("expected is: " + expected);
        List<List<Integer>> actual = Solution.threeSum(nums);
        System.out.println("actual is: " + actual);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void ThreeSumZeroes() {
        int[] nums = {0,0,0};
        System.out.println("input is: " + Arrays.toString(nums));
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(0,0,0));
        System.out.println("expected is: " + expected);
        List<List<Integer>> actual = Solution.threeSum(nums);
        System.out.println("actual is: " + actual);
        Assert.assertEquals(actual,expected);
    }

}
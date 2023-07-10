import org.litt.threeSum.Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// TODO: Tests should pass regardless of order in either (parent or child) list
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
//        Assert.assertEquals(actual.size(), expected.size());
//        Assert.assertTrue(actual.containsAll(expected));
//        Assert.assertTrue(expected.containsAll(actual));
    }

    @Test
    public void ThreeSumExtra() {
        int[] nums = {-1, 0, 1, 1, 2, -1, -4};
        System.out.println("input is: " + Arrays.toString(nums));
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-1, -1, 2), Arrays.asList(-1, 0, 1));
        System.out.println("expected is: " + expected);
        List<List<Integer>> actual = Solution.threeSum(nums);
        System.out.println("actual is: " + actual);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void ThreeSumWrongIteration() {
        int[] nums = {3,0,-2,-1,1,2};
        System.out.println("input is: " + Arrays.toString(nums));
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-2,-1,3), Arrays.asList(-2,0,2),Arrays.asList(-1,0,1));
        System.out.println("expected is: " + expected);
        List<List<Integer>> actual = Solution.threeSum(nums);
        System.out.println("actual is: " + actual);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void ThreeSumLong() {
        int[] nums = {0,3,0,1,1,-1,-5,-5,3,-3,-3,0};
        System.out.println("input is: " + Arrays.toString(nums));
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-3,0,3), Arrays.asList(-1,0,1),Arrays.asList(0,0,0));
        System.out.println("expected is: " + expected);
        List<List<Integer>> actual = Solution.threeSum(nums);
        System.out.println("actual is: " + actual);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void ThreeSumHard() {
        int[] nums = {-4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0};
        System.out.println("input is: " + Arrays.toString(nums));
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-5,1,4), Arrays.asList(-4,0,4),Arrays.asList(-4,1,3),
                Arrays.asList(-2,-2,4), Arrays.asList(-2,1,1),Arrays.asList(0,0,0));
        System.out.println("expected is: " + expected);
        List<List<Integer>> actual = Solution.threeSum(nums);
        System.out.println("actual is: " + actual);
        Assert.assertEquals(actual, expected);
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

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.litt.islandPerimeterLC.Solution.getIslandPerimeter;
import static org.testng.Assert.*;

public class IslandPerimeterTest {

    @Test
    public void testGetIslandPerimeterSingle() {
        int[][] island = {{1}};
        int actual = getIslandPerimeter(island);
        int expected = 4;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testGetIslandPerimeterShort() {
        int[][] island = {{1,0}};
        int actual = getIslandPerimeter(island);
        int expected = 4;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testGetIslandPerimeterLong() {
        int[][] island = {{1,1,1,1}};
        int actual = getIslandPerimeter(island);
        int expected = 10;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testGetIslandPerimeterTall() {
        int[][] island = {{1}, {1}, {1}, {1}};
        int actual = getIslandPerimeter(island);
        int expected = 10;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testGetIslandPerimeterSquare() {
        int[][] island = {{0,1,0,0}, {1,1,1,0}, {0,1,0,0}, {1,1,0,0}};
        int actual = getIslandPerimeter(island);
        int expected = 16;
        Assert.assertEquals(actual,expected);
    }
}
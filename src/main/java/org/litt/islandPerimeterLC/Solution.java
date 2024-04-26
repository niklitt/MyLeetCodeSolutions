package org.litt.islandPerimeterLC;

public class Solution {

    public static int getIslandPerimeter(int[][] grid) {
        int perimeter = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    perimeter += surroundingPerimeters(grid, i, j);
                }
            }
        }

        return perimeter;
    }

    private static int surroundingPerimeters(int[][] grid, int yCoords, int xCoords) {
        int howManyPerimeters = 0;

        // Empty above
        if (yCoords == 0) {
            howManyPerimeters++;
        } else if (grid[yCoords - 1][xCoords] == 0) {
            howManyPerimeters++;
        }

        // Empty to the left
        if (xCoords == 0) {
            howManyPerimeters++;
        } else if (grid[yCoords][xCoords - 1] == 0) {
            howManyPerimeters++;
        }

        // Empty below
        if (yCoords == grid.length - 1) {
            howManyPerimeters++;
        } else if (grid[yCoords + 1][xCoords] == 0) {
            howManyPerimeters++;
        }

        // Empty to the right
        if (xCoords == grid[0].length - 1) {
            howManyPerimeters++;
        } else if (grid[yCoords][xCoords + 1] == 0) {
            howManyPerimeters++;
        }

        return howManyPerimeters;
    }

    public static void main(String[] args) {
        int[][] island1 = {{0,1,0,0}, {1,1,1,0}, {0,1,0,0}, {1,1,0,0}};
        System.out.println("The perimeter of island1 is: " + getIslandPerimeter(island1));

        int[][] island2 = {{1}};
        System.out.println("The perimeter of island2 is: " + getIslandPerimeter(island2));

        int[][] island3 = {{1,1,1,1}};
        System.out.println("The perimeter of island3 is: " + getIslandPerimeter(island3));

        int[][] island4 = {{1}, {1}, {1}, {1}};
        System.out.println("The perimeter of island4 is: " + getIslandPerimeter(island4));
    }

}

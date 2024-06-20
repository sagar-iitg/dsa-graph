package com.sk.graph.leetcode;

public class LeetCode463IslandPerimeter {


    public int islandPerimeter(int[][] grid) {

        int row = grid.length;
        int col = grid[0].length;
        int perimeter = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    int res = checkLand(grid, i, j);
                    perimeter = res + perimeter;
                }
            }
        }
        return perimeter;
    }


    public static void main(String[] args) {
        int[][] grid = {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        int ans = checkLand(grid, 0, 1);
        System.out.println(ans);

    }

    private static int checkLand(int[][] grid, int i, int j) {

        int c = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        if (i==0 || grid[i - 1][j] == 0) c++;

        if (i == rows - 1  || grid[i + 1][j] == 0) c++;

        if ( j == 0 || grid[i][j - 1] == 0) c++;

        if (j == cols - 1 || grid[i][j + 1] == 0) c++;

        return c;

    }
}


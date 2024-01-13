class Solution {
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length;
        int numberOfIslands = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (grid[i][j] == '1') {
                    numberOfIslands++;
                    dfs(grid, i, j, rows, columns);
                }
            } // inner loop
        } // outer-loop
        return numberOfIslands;
    } // function end

    private void dfs(char[][] grid, int currentRow, int currentCol, int maxRows, int maxCols) {
        if (currentRow < 0 || currentCol < 0 || currentRow >= maxRows || currentCol >= maxCols
                || grid[currentRow][currentCol] == '0') {
            return;
        }
        grid[currentRow][currentCol] = '0';
        dfs(grid, currentRow + 1, currentCol, maxRows, maxCols);
        dfs(grid, currentRow - 1, currentCol, maxRows, maxCols);
        dfs(grid, currentRow, currentCol + 1, maxRows, maxCols);
        dfs(grid, currentRow, currentCol - 1, maxRows, maxCols);
    }

}

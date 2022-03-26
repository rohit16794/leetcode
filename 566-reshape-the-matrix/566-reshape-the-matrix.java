class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int columns = mat[0].length;
        
        if(r*c != rows*columns)
            return mat;
        
        int resultArray[][] = new int[r][c];
        int rowItr = 0,colItr = 0;
        
        for(int i = 0; i<rows; i++) {
            for(int j = 0; j<columns; j++) {
                resultArray[rowItr][colItr++] = mat[i][j];
                
                if(colItr == c) {
                    rowItr++;
                    colItr = 0;
                }
            }
        }
        
        return resultArray;
    }
}
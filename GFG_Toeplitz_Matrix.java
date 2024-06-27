class Solution {
    /*You are required to complete this method*/
    boolean isToeplitz(int mat[][]) {
        // Traverse the matrix
        for (int i = 1; i < mat.length; i++) {
            for (int j = 1; j < mat[i].length; j++) {
                // Check if the current element is equal to the top-left diagonal element
                if (mat[i][j] != mat[i - 1][j - 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}

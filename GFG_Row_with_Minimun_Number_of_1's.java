class Solution {
    int minRow(int n, int m, int a[][]) {
        int minCount = Integer.MAX_VALUE;
        int minRowIndex = -1;

        for (int i = 0; i < n; i++) {
            int rowCount = 0;
            for (int j = 0; j < m; j++) {
                if (a[i][j] == 1) {
                    rowCount++;
                }
            }
            if (rowCount < minCount) {
                minCount = rowCount;
                minRowIndex = i + 1; 
            }
        }

        return minRowIndex;
    }
};

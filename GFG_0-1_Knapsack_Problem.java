class Solution 
{ 
    
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here 
        int[][] mat = new int[n+1][W+1];
        for(int i = 0; i <= n; i++){
            for(int j = 0; j<= W; j++){
                if(i == 0 || j == 0){
                    mat[i][j] = 0;
                }
                else if(wt[i-1] <= j){
                    mat[i][j] = Math.max(val[i-1] + mat[i-1][j-wt[i-1]], mat[i-1][j]);
                }
                else{
                    mat[i][j] = mat[i-1][j];
                }
            }
        }
        return mat[n][W];
    } 
}

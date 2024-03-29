class Solution {
    static int gameOfXor(int N , int[] A) {
        int a = 0;
        if(N%2!=0){
            for(int i = 0; i<N; i+=2){
                a^=A[i];
            }
            return a;
        }
        else{
            return 0;
        }
    }
};

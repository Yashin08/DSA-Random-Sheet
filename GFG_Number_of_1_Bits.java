class Solution {
    static int setBits(int N) {
        int count = 0;
        while(N>0){
            if((N&1)==1){       // Step 1 - '& 1' Operation
                count++;
            }
            N = N>>1;          // Step 2 - Right Shift by 1
        }
        return count;
    }
}

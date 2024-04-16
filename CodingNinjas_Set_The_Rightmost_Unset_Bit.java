public class Solution {
    public static int setBits(int N){
        int n = Integer.toBinaryString(N).length();
        for(int i = 0; i<n; i++){
            if((N & 1<<i) == 0){
                return N | 1<<i;
            }
        }
        return N;
    }
}

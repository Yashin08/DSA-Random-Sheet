class Solution {

    int[] Series(int n) {
        int[] result = new int[n+1];
        int modu = 1000000007;
        result[0] = 0;
        result[1] = 1;
        for(int i = 2; i<=n; i++){
            result[i] = ((result[i-2]%modu) + (result[i-1]%modu))%modu;
        }
        return result;
    }
}

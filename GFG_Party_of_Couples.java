class Solution{
    static int findSingle(int n, int arr[]){
        int val = 0;
        for(int i = 0; i<n; i++){
            val ^= arr[i];
        }
        return val;
    }
}

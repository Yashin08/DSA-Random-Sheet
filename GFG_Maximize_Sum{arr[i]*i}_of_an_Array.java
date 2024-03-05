class Solution{
    static final long MOD = (long) 1e9 + 7;
    int Maximize(int arr[], int n)
    {
       long sum = 0;
       Arrays.sort(arr);
       for(int i=0;i<n;i++) sum = (sum + i * (long) arr[i]) % MOD;
       return (int) sum;
    }   
}

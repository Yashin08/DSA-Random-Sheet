class Solution
{
    public static int[] countElements(int a[], int b[], int n, int query[], int q)
    {
        int[] result = new int[q];
        int count = 0;
        for(int i = 0; i<q; i++){
            int m = query[i];
            for(int j = 0; j<n; j++){
                if(b[j] <= a[m]){
                    count += 1;
                }
                result[i] = count;
            }
            count = 0;
        }
        return result;
    }
}

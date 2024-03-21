class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        int i = n-1, j = 0;
        while(i>=0 && j<m){
            if(arr1[i] > arr2[j]){
                swap(arr1, arr2, i, j);
                i--;
                j++;
            }
            else{
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
    
    static void swap(long[] arr1, long[] arr2, int first, int second){
        long temp = arr1[first];
        arr1[first] = arr2[second];
        arr2[second] = temp;
    }
}

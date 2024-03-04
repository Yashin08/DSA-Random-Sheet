class Solution
{
    public void swapElements(int[] arr, int n)
    {
        for(int i = 0; i<n; i++){
            if(i+2 <= n-1){          // checking whether i+2 exists or not for that particular iteration
                int temp = arr[i];   // if i+2 exists then swap
                arr[i] = arr[i+2];
                arr[i+2] = temp;
            }
        }
    }
}



//User function Template for Java

class Solution
{
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void rotateArr(int arr[], int d, int n)
    {
         d = d % n; // Handle cases where d > n

        // Reverse the first d elements of the array
        reverse(arr, 0, d - 1);

        // Reverse the remaining elements of the array
        reverse(arr, d, n - 1);

        // Reverse the entire array
        reverse(arr, 0, n - 1);
    }
    
    private static void reverse(int[] arr,int i,int r){
        while(i<r){
            int temp=arr[i];
            arr[i]=arr[r];
            arr[r]=temp;
            i++;
            r--;
        } 
    }
}

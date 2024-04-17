class Solution {
    int findMaximum(int[] arr, int n) {
        // lower bound
        int low = 0, high = n-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[0] > arr[1]){
                return arr[0];
            }
            if(mid == 0 && arr[0] < arr[1]){
                return arr[1];
            }
            else if(mid == n-1 && arr[n-1] > arr[n-2]){
                return arr[n-1];
            }
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                return arr[mid];
            }
            else if(arr[mid] < arr[mid-1]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return 0;
    }
}

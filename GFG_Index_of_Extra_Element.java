class Solution {
    public int findExtra(int n, int arr1[], int arr2[]) {
        // add code here.
        int left = 0;
        int right = n-1;
        int start;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(mid >= arr2.length){
                return n-1;
            }
            if(arr1[mid] != arr2[mid]){
                right = mid;
                break;
            }
            else{
                
                left = mid+1;
            }
        }
        for(int i = left; i <= right; i++){
            if(arr1[i] != arr2[i]){
                return i;
            }
        }
        return -1;
    }
}

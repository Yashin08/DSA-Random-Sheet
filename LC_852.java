class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 0, high = arr.length-1, result = 0;;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid] > arr[mid+1]){
                if(arr[result] < arr[mid]){
                    result = mid;
                }
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return result;
    }
}

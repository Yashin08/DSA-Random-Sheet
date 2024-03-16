class Solution {
    int count(int[] arr, int n, int x) {
        int low = 0, high = n-1, lb = n, hb = n;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] >= x){
                lb = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        low = 0;
        high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] > x){
                hb = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return hb-lb;
    }
}

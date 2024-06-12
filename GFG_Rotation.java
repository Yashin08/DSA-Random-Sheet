
class Solution {
    int findKRotation(int arr[], int n){
        // code here
        int low = 0  , high = n-1; 
	    while(low <= high){
            if(low == high){
                return low ; 
            }
            int mid = (low + high)/2; 
            if(arr[mid] >arr[high]){
                low = mid + 1; 
            }
            else{
                high = mid; 
	        }
	   }
	   return low;
    }
}

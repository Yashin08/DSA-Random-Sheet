
//User function Template for Java

class Solution {
    int print2largest(int arr[], int n) {
        
        Arrays.sort(arr);
        int j = n-1;
        for(int i = n-2; i>-1; i--){
            if(arr[j]>arr[i]){
                return arr[i];
            }
            else{
                j--;
            }
        } 
        return -1;
    }
}

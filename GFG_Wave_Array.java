class Solution {
    public static void convertToWave(int n, int[] a) {
        for(int i = 1; i<n; i++){
            if(i==n-1 && n%2!=0){
                break;
            }
            else{
                int temp = a[i];
                a[i] = a[i-1];
                a[i-1] = temp;
                i++;
            }
        }
        
    }
}

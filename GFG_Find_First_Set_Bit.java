class Solution
{
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n){
            
        for(int i = 0; i<n; i++){
            
            int a = (n>>i) & 1;
            if(a == 1){
                return i+1;
            }
            else{
                continue;
            }
        }
        return 0;
            
    }
}

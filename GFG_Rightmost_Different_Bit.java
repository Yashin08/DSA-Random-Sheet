class Solution
{
    //Function to find the first position with different bits.
    public static int posOfRightMostDiffBit(int m, int n)
    {
        int diff = 1;
        while(n>0 || m>0){
            if((n&1) == (m&1)){
                diff++;
            }
            else{       
                return diff;
            }
            n = n>>1;
            m = m>>1;
        }
        return -1;  
    }
}

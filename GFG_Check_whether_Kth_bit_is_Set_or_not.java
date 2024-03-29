class CheckBit
{
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k)
    {
        int a = n & (1<<k);
        if( a == 0){
            return false;
        }
        else{
            return true;
        }
    }
    
}

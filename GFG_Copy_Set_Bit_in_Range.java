class Solution{
    static int setSetBit(int x, int y, int l, int r){
        for(int i = l; i<=r; i++){
            int a = y & (1<<(i-1));
            if(a != 0){
                x = x | (1<<(i-1));
            }
            else{
                continue;
            }
        }
        return x;
    }
}

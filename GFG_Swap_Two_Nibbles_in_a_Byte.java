class Solution{
    static int swapNibbles(int N) {
        return (N>>4)|((N&15)<<4);
    }
}

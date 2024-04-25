class Solution {
    static Long reversedBits(Long x) {
        long rev = 0;
        int bitCount = 32; // Assuming 64-bit long
        while (bitCount-- > 0) {
            rev <<= 1;
            if ((x & 1) == 1) {
                rev ^= 1;
            }
            x >>= 1;
        }
        return rev;
    }
};

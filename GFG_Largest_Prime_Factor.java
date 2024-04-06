class Solution {
    static long largestPrimeFactor(int N) {
        int largestPrime = -1;

        // Remove multiples of 2
        while (N % 2 == 0) {
            largestPrime = 2;
            N /= 2;
        }

        // Now, N must be odd. We start from 3 and only iterate over odd numbers.
        for (int i = 3; i <= Math.sqrt(N); i += 2) {
            while (N % i == 0) {
                largestPrime = i;
                N /= i;
            }
        }

        // If N is a prime number greater than 2
        if (N > 2) {
            largestPrime = N;
        }

        return largestPrime;
    }
}

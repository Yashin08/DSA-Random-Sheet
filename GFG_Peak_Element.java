class Solution {
    // Function to find the peak element
    // arr[]: input array
    // n: size of array a[]
    public int peakElement(int[] arr, int n) {
        int left = 0, right = n - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[mid + 1]) {
                right = mid; // If mid is greater than the next element, potential peak is in the left half
            } else {
                left = mid + 1; // If mid is less than or equal to the next element, potential peak is in the right half
            }
        }

        return left; // When left == right, we've found the peak
    }
}

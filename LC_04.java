class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, result, 0, nums1.length);
        System.arraycopy(nums2, 0, result, nums1.length, nums2.length);
        Arrays.sort(result);
        int x = result.length;
        if (x % 2 == 0) { //index starts with 0
            int a = result[(x / 2) - 1];
            int b = result[(x) / 2];
            return (double) (a + b) / 2;
        } else {
            return (double) result[(x - 1) / 2]; //returns solution
        }
    }
}

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // avoid duplicates
            }
            if (nums[i] > 0) {
                break; // no result with sum 0 possible
            }
            int j = nums.length - 1;
            int k = i + 1;
            while (k < j) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    k++;
                    while (k < j && nums[k] == nums[k - 1]) {
                        k++; // avoid duplicates
                    }
                } else if (sum > 0) {
                    j--;
                } else {
                    k++;
                }
            }
        }
        return result;
    }
}

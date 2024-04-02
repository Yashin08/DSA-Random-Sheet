class Solution {
    public int search(int[] nums, int target) {
        int result = 0;
        int counter = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == target){
                result = i;
                counter = 1;
                break;
            }
            if(counter == 0){
                result = -1;
            }
        }
        return result;
    }
}

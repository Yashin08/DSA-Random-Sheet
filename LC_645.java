class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] list = new int[2];
        int i = 0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]<=nums.length && nums[i]!= nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }
        for(int j = 0; j<nums.length; j++){
            if(nums[j] != j+1){
                list[0] = nums[j];
                list[1] = j+1;
            }
        }
        return list;
    }
    void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}

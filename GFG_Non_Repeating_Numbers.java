class Solution
{
    public int[] singleNumber(int[] nums)
    {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int j = 0;
        int[] result = new int[2];
        for(Integer i : nums){
            if(hm.containsKey(i)){
                hm.put(i, hm.get(i)+1);
            }
            else{
                hm.put(i, 1);
            }
        }
         for(int i=0;i<nums.length;i++){
            if(hm.get(nums[i])==1){
                result[j++]=nums[i];
            }
        }
        
        if(result[0] > result[1]){
            int temp = result[0];
            result[0] = result[1];
            result[1] = temp;
        }
        return result;
    }
}

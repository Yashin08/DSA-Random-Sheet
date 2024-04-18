class Solution
{
    //Function to find two repeated elements.
    public int[] twoRepeated(int arr[], int n)
    {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        int j = 0;
        for(Integer i : arr){
            if(hm.containsKey(i)){
                hm.put(i, hm.get(i)+1);
                result[j] = i;
                j++;
            }
            else{
                hm.put(i, 1);
            }
        }
        return result;
    }
}

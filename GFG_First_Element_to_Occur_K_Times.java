class Solution
{
    public int firstElementKTime(int n, int k, int[] a) { 
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(Integer i : a){
            if(hm.containsKey(i)){
                hm.put(i, hm.get(i)+1);
            }
            else{
                hm.put(i,1);
            }
            if(hm.get(i) == k){
                return i;
            }
        }
        return -1;
    } 
}

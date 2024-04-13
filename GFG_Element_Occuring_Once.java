class Solution {
    static int singleElement(int[] arr , int N) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(Integer i : arr){
            if(hm.containsKey(i)){
                hm.put(i, hm.get(i)+1);
            }
            else{
                hm.put(i, 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            int value = entry.getValue();
            if(value == 1){
                return entry.getKey();
            }
        }
        return 0;
    }
}

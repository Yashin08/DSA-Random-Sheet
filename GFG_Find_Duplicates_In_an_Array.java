class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int value = 0;
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(Integer i : arr){
            if(hm.containsKey(i)){
                hm.put(i, hm.get(i)+1);
            }
            else{
                hm.put(i, 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            value = entry.getValue();
            if(value >= 2){
                result.add(entry.getKey());
            }
        }
        if(result.isEmpty()){
            result.add(-1);
            return result;
        }
        else{
            Collections.sort(result);
            return result;
        }
    }
}

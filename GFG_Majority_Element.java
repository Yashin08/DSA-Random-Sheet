

//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
        HashMap<Integer, Integer> result = new HashMap<Integer, Integer>();
        int max = 0, value = 0, ans = -1;
        for(Integer i : a){
            if(result.containsKey(i)){
                result.put(i, result.get(i)+1);
            }
            else{
                result.put(i, 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : result.entrySet()){
            value = entry.getValue();
            if(value > (size/2)){
                ans = entry.getKey();
            }
        }
        
        return ans;
    }
}

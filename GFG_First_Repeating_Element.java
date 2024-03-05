class Solution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr, int n) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int index = -1;
        for(int i = 0; i<n; i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i], 1);
            }
        }
        for(int i=0;i<n;i++){
            if(hm.get(arr[i])>1){
                index=i+1;
                break;
            }
        }
        return index;
    }
}

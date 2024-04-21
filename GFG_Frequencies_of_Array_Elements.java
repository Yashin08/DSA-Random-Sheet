class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(Integer i : arr){
            if(hm.containsKey(i)){
                hm.put(i, hm.get(i)+1);
            }
            else{
                hm.put(i, 1);
            }
        }
        for(int j = 1; j<=N; j++){
            if(hm.containsKey(j)){
                arr[j-1] = hm.get(j);
            }
            else{
                arr[j-1] = 0;
            }
        }
    }
}

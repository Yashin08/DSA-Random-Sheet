class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        ArrayList<Integer> res = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        for(Integer i : arr1){
            if(!hs.contains(i)){
                hs.add(i);
                res.add(i);
            }
        }
        for(Integer j : arr2){
            if(!hs.contains(j)){
                hs.add(j);
                res.add(j);
            }
        }
        Collections.sort(res);
        return res;
    }
}

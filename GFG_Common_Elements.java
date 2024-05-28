

//User function Template for Java

class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        int count = 0, ans = 0;
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();   
        ArrayList<Integer> result = new ArrayList<Integer>();              
        for(Integer i : A){                                               // Checking and adding elemts of array A in hashmap
            if(hm.containsKey(i)){                                        // Skipping the iteration if the elemts repeats
                continue;
            }
            else{
                hm.put(i, 1);
            }
        }
        for(Integer i : B){                                               // Checking if elements repeats, if yes then increase the count 
            if(hm.containsKey(i) && hm.get(i)==1){
                hm.put(i, hm.get(i)+1);
            }
            else{
                continue;                                                 // if they are not repeating then skip
            }
        }
        for(Integer i : C){
            if(hm.containsKey(i) && hm.get(i)==2){                        // again checking if the elements are repeating and having the Value=2 means they were present in both the arrays
                hm.put(i, hm.get(i)+1);                                   // if yes then increment
            }
            else{
                continue;
            }
        }
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            count = entry.getValue();
            if(count == 3){                                               // checking the numbers with value 3, having value 3 means they were present in all the three arrays
                ans = entry.getKey();                                     // adding all the elements with value 3
                result.add(ans);
            }
        }
        Collections.sort(result);
        return result;
    }
}

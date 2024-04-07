class Solution
{    
    public static boolean isAnagram(String a,String b)
    {
        HashMap<Character, Integer> hm1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> hm2 = new HashMap<Character, Integer>();
        
        for(int i = 0; i<a.length(); i++){
            if(hm1.containsKey(a.charAt(i))){
                hm1.put(a.charAt(i), hm1.get(a.charAt(i))+1);
            }
            else{
                hm1.put(a.charAt(i),1);
            }
        }
        
        for(int i = 0; i<b.length(); i++){
            if(hm2.containsKey(b.charAt(i))){
                hm2.put(b.charAt(i), hm2.get(b.charAt(i))+1);
            }
            else{
                hm2.put(b.charAt(i),1);
            }
        }
        
        if(hm1.equals(hm2)){
            return true;
        }
        else{
            return false;
        }
    }
}

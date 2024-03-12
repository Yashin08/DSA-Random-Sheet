class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i =0; i<S.length(); i++){
            char ch = S.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch, hm.get(ch)+1);
            }
            else{
                hm.put(ch, 1);
            }
        }
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (hm.get(ch) == 1) {
                return ch;
            }
        }
        return '$';
    }
}

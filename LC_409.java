class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch, hm.get(ch)+1);
            }
            else{
                hm.put(ch, 1);
            }
        }
        
        boolean bool = false;
        for(Map.Entry<Character, Integer> entry : hm.entrySet()){
            int value = entry.getValue();
            if(value % 2 == 0){
                count += value;
            }
            else if(value % 2 != 0){
                count += value-1; //to add the even value to the count, like if we have frquenct 3, then it will add 2
                bool = true; //this will be used later to add 1 to count, as atleast 1 add character can be included
            }
        }

        if(bool){
            count += 1; //we can have atleast 1 odd character
        }
        return count;
    }
}

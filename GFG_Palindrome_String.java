class Solution {
    int isPalindrome(String S) {
        int len = S.length()-1;
        for(int i = 0; i<S.length()/2; i++){
            if(S.charAt(i) == S.charAt(len-i)){
                continue;
            }    
            else{
                return 0;
            }
        }
        return 1;
    }
};

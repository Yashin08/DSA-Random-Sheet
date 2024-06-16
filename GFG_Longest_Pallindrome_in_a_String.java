class Solution{
    static String longestPalin(String S){
        // code here
        if(S.length() <= 1){
            return S;
        }
        
        String maxStr = S.substring(0,1);
        for(int i = 0; i < S.length(); i++){
            String odd = expandFromCentre(S, i, i);
            String even = expandFromCentre(S, i, i+1);
            if(odd.length() > maxStr.length()){
                maxStr = odd;
            }
            if(even.length() > maxStr.length()){
                maxStr = even;
            }
        }
        return maxStr;
    }
    
    public static String expandFromCentre(String S, int left, int right){
        while(left >= 0 && right < S.length() && S.charAt(left) == S.charAt(right)){
            left--;
            right++;
        }
        return S.substring(left+1, right);
    }
}

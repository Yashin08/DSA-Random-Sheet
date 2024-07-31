class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        
        if(arr.length == 0){
            return "-1";
        }
        
        String str = arr[0];
        for(int i = 1; i < arr.length; i++){
            
            int len = Math.min(str.length(), arr[i].length());
            int j = 0;
            while(j < len && arr[i].charAt(j) == str.charAt(j)){
                j++;
            }
            
            str = str.substring(0, j);
            
            if(str.isEmpty()){
                return "-1";
            }
        }
        
        return str;
    }
}

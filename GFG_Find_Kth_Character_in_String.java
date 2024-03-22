class Solution {
    char kthCharacter(int m, int n, int k) {
        String str = Integer.toBinaryString(m);
        StringBuilder sb = new StringBuilder(str);
        int i = 0, j = 0;
        while(i<n){
            if(sb.charAt(j) == '1'){
                sb.insert(j+1, '0');
                j += 2;
            }
            else{
                sb.insert(j+1, '1');
                j += 2;
            }
            if(j == sb.length()){
                j = 0;
                i++;
            }
        }
        return sb.charAt(k-1);
    }
}

class Solution {
    public int findPeakElement(List<Integer> a) {
        int lower_limit = 0;
        int higher_limit = a.size()-1;
        
        while(lower_limit < higher_limit){
            int mid = lower_limit + (higher_limit - lower_limit)/2;
            if(a.get(mid) > a.get(mid+1)){
                higher_limit = mid;
            }
            else{
                lower_limit = mid+1;
            }
        }
        return a.get(lower_limit);
    }
}

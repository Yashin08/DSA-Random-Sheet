class Solution {
    public int maxArea(int[] height) {
        int area=0;
        int i = 0;
        int j= height.length-1;
        while(i<j){
            int a = Math.min(height[i], height[j]);
            area = Math.max(area, a*(j-i));
            if(height[i]<height[j]){ //Max value will remain constant and the least one will change
                i++;
            } else{
                j--;
            }
        }
        return area;             
    }
}

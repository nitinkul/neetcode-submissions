class Solution {
    public int maxArea(int[] heights) {
        int l =0 ;
        int r=heights.length -1;
        int maxWater = 0;
        while(l < r){
            //System.out.println(l+" "+r+" "+maxWater+" "+Math.min(heights[l],heights[r]));
            maxWater = Math.max(maxWater, Math.min(heights[l],heights[r]) * (r-l));
            //System.out.println(l+" "+r+" "+maxWater);
            if(heights[l] < heights[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxWater;
    }
}

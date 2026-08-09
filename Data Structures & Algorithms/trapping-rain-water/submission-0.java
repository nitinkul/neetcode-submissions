class Solution {
    public int trap(int[] height) {
        int ht = height.length;
        int[] left = new int[ht];
        int[] right = new int[ht];
        left[0]= height[0];
        for(int i=1;i<ht;i++){
            left[i] = Math.max(left[i-1],height[i]);
        }
        right[ht-1]= height[ht-1];
        for(int i=ht-2;i>=0;i--){
            right[i] = Math.max(right[i+1],height[i]);
        }
        int water = 0;
        for(int i=0;i<ht;i++){
            water += Math.min(left[i],right[i]) - height[i];
        }
        return water;
    }
}

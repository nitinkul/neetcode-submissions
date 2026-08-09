class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length];
        int[] post = new int[nums.length];
        int prod = 1;
        pre[0] = 1;
        for(int i=1;i<nums.length;i++){
            pre[i] = prod * nums[i-1];
            prod = prod * nums[i-1];
        }
        post[nums.length-1] = 1;
        prod = 1;
        for(int i=nums.length-2;i>=0;i--){
            post[i] = prod * nums[i+1];
            prod = prod * nums[i+1];
        }
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i] = pre[i] * post[i];
        }
        return ans;
    }
}  

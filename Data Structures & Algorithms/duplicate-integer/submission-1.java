class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i:nums){
            if(map.containsKey(Integer.valueOf(i))){
                return true;
            }
            map.put(Integer.valueOf(i),1);
        }
        return false;
    }
}
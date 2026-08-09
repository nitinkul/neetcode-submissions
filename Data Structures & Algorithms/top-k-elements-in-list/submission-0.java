class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer,Integer> map = new HashMap<>();
       for(int i=0;i<nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
       }
       List<Integer>[] lst = new List[nums.length + 1];
       for(int i=0;i<lst.length;i++){
        lst[i] = new ArrayList<>();
       }
       for(int key: map.keySet()){
        lst[map.get(key)].add(key);
       }
       int[] res = new int[k];
       int index = 0;
       for(int i=lst.length -1; i>0 && index <k; i--){
            for(int z:lst[i]){
                res[index++] = z;
                if(index == k){
                    return res;
                }
            }
       }
       return res;
    }
}

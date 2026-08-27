class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            int num = map.getOrDefault(i, 0);
            map.put(i,num+1);
        }
        List<Integer> lst = map.entrySet().stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());
        lst.forEach(System.out::println);
        int[] ans = new int[k];
        for(int i=0;i<k;i++){
            ans[i] = lst.get(i);
        }
        return ans;
    }
}

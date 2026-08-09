class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String s:strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String cc = new String(c);
            List<String> tmp = map.getOrDefault(cc,new ArrayList());
            tmp.add(new String(s));
            map.put(cc, tmp);
        }
        List<List<String>> ans = new ArrayList<>();
        for(String key: map.keySet()){
            ans.add(map.get(key));
        }
        return ans;
    }
}

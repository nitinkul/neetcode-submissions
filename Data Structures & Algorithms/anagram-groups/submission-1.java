class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> ans = new HashMap<>();
        for(String str: strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String sorted = String.valueOf(ch);
            List ls = ans.getOrDefault(sorted, new ArrayList<String>());
            ls.add(str);
            ans.put(sorted,ls);
        }
        return ans.values().stream().collect(Collectors.toList());
    }
}

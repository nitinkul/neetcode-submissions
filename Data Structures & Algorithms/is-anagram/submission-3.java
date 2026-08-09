class Solution {
    public boolean isAnagram(String s, String t) {
        if(s == null && t ==null) return true;
        if(s == null || t == null) return false;
        if(s.length() != t.length()) return false;
        int[] sarr = new int[26];
        for(int i=0;i<s.length();i++){
            sarr[(int)s.charAt(i)-97]++;
        }
        for(int j=0;j<t.length();j++){
            sarr[(int)t.charAt(j)-97]--;
            if(sarr[(int)t.charAt(j)-97] < 0){
                return false;
            }
        }
        for(int i=0;i<sarr.length;i++){
            if(sarr[i] != 0)
            return false;
        }
        return true;
    }
}

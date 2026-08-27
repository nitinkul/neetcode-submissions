class Solution {

    public String encode(List<String> strs) {
        StringBuilder br = new StringBuilder();
        for(String s: strs){
            br.append(String.format("%s#%s", s.length(), s));
        }
        //System.out.print(br.toString());
        return br.toString();
    }

    public List<String> decode(String str) {
        System.out.println(str);
        List<String> ans = new ArrayList<>();
        char[] c = str.toCharArray();
        int rt = 0;
        int lt = 0;
        while(rt < c.length){
            while(c[rt]!= '#'){
                rt++;
            }
            
            List<Character> lst = new ArrayList<>();
            List<Character> lstwrd = new ArrayList<>();
            while(lt !=rt){
                lst.add(c[lt]); lt++;
            }
            int wordLen = Integer.parseInt(charListToString(lst));
            //System.out.println(wordLen +" " + lt + " " + rt);
            if(wordLen == 0){
               ans.add(""); 
            }else{
                while(rt != (lt+wordLen)){
                rt++;
                lstwrd.add(c[rt]);
                 }
                //System.out.println(charListToString(lstwrd));
                ans.add(charListToString(lstwrd));
            }
            rt++;lt = rt;
        }
        return ans;
    }

    private String charListToString(List<Character> list){
        StringBuilder sb = new StringBuilder(list.size());
        for (Character ch : list) {
            sb.append(ch);
        }
        return sb.toString();
    }
}

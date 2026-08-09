class Solution {
    public boolean isValid(String s) {
        int len = s.length();
        if(len%2 !=0)return false;
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray()){
            if( c=='{' || c=='(' || c == '['){
                stack.push(c);
            } else {
                if(stack.empty())return false;
                char p = stack.peek();
                if( (c == ')' && p == '(') 
                || (c == '}' && p == '{') 
                || (c == ']' && p == '[')){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return stack.empty() ? true:false;
        
    }
}

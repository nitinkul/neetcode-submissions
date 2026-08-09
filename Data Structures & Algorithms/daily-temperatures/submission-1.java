class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] op = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>();
        for(int i=0; i<temperatures.length; i++){
            int t = temperatures[i];
            while(!stack.empty() && t > stack.peek()[0]){
                int[] p = stack.pop();
                op[p[1]] = i-p[1];
            }
            stack.push(new int[]{t,i});
        }
        return op;
    }
}
//[30,38,30,36,35,40,28]

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] op = new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            op[i] = 0;
            for(int j=i+1;j<temperatures.length;j++){
                if(temperatures[j] > temperatures[i]){
                    op[i] = j-i;
                    break;
                }
            }
        }
        return op;
    }
}

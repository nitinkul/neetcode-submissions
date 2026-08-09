class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int len = position.length;
        int[][] pair = new int[len][2];
        for(int i=0;i<len;i++){
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }

        Arrays.sort(pair, (a,b)-> Integer.compare(b[0],a[0]));
        int fleets = 1;
        double prev = (double)(target - pair[0][0])/pair[0][1];
        for(int i=1; i<len; i++){
            double curr = (double)(target - pair[i][0])/pair[i][1];
            if(curr > prev){
                fleets++;
                prev = curr; //because a car can not ovetake car front of it.
            }
        }
        return fleets;
    }
}

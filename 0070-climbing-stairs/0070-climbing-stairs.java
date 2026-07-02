class Solution {
    public int climbStairs(int n) {
        int prev2=2;
        int prev=3;
        int cur=0;
        if(n<=3){
            return n;
        }
        for(int i=4;i<=n;i++){
           cur=prev+prev2;
           prev2=prev;
           prev=cur;
        }
        return cur;
    }
}
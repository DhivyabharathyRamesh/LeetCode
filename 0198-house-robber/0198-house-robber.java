class Solution { 
    public int rob(int[] n){
        
        int[] memo=new int[n.length];
        Arrays.fill(memo,-1);
        return recursion(n,n.length-1,memo);


    }
    static int recursion(int[] n,int i,int[] memo){

            if(i==0){
                memo[0] = n[0];
                return memo[0];
            }
            if(i<0){
                return 0;
            }
            if(memo[i]!=-1){
                return memo[i];
            }
            return memo[i]=Math.max(n[i]+recursion(n,i-2,memo),recursion(n,i-1,memo));

    }
}
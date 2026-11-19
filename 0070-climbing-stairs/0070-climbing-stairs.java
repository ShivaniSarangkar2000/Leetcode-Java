class Solution {

    /*int helperRec(int n, int[] dp){
        if( n==1 || n==2 ){
            return n;
            }

            if(dp[n] != -1){
                return dp[n];

            }
    
            dp[n] =  helperRec(n-1,dp) + helperRec(n-2,dp);
         return dp[n];
    }*/
    
    public int climbStairs(int n) {
        
        //1. top down
        //int [] dp = new int[n+1];
        //Arrays.fill(dp, -1);
        //return helperRec(n,dp);

        //2. Bottom up
        if (n == 0 || n == 1 ) return n;
        int [] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;

          for(int i=3; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];

          }
          return dp[n];
        

        
        //  if (n == 0 || n ==1  || n==2) {
       //     return n;
       // }

        /*int prev1 = 1;
        int prev2 = 2;

        int current;

        for(int i=3; i<=n; i++){
            current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;

        }
        
        return prev2;*/
        
    }
}
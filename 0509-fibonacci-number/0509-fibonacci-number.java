class Solution {

     int fibRec(int n, int[] dp){
        //base cases
        if(n == 0 || n ==1)
            return n;
        
        if(dp[n] != 0){
            return dp[n];
        }
        dp[n] =  fibRec(n-1,dp) + fibRec(n-2,dp);
        return dp[n];

    }
    public int fib(int n) {
        /*With normal recursion
        if(n==0 || n==1)
            return n;
        return fib(n-1) + fib(n-2);*/

        //Top down approach
        int[] dp = new int[n+1];
       // Arrays.fill(dp,-1);
        return fibRec(n,dp);

    }
}
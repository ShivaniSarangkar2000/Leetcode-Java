class Solution {
    /*int helperRec(int[] cost, int i, int[] dp){
        //base case
        /*if(i >= cost.length){
            return 0;
            }

        int a = helperRec(cost, i+1) + cost[i];
        int b = helperRec(cost, i+2) + cost[i];*/

        //base cases
      // if(i==0) return cost[0];
      // if(i==1) return cost[1];

       //base cases
         /* if (i == 0 || i == 1) {
            return cost[i];
        }

        if(dp[i] != -1){
           return dp[i];
        }

        int a = cost[i] + helperRec(cost, i-1, dp);//from top to bottom
        int b = cost[i] + helperRec(cost, i-2, dp);
      return  dp[i] = Math.min(a, b);

      //  return dp[i];
      }
      */

      //base case
    //   if(i == 0){
    //     return cost[0];
    //   }
    //   int prev1 = 0;
    //   int prev2 = 1;
    //   int current;

    //   for(int i=2; i<=n; i++){
    //     current = prev1 + prev2;
    //     prev1 =prev2;
    //     prev2 = current;

    //   }
    //   return prev2;




    public int minCostClimbingStairs(int[] cost) {
        //1.Recursion - from 0 and 1 till top
       // int n = cost.length;
       // return Math.min(helperRec(cost, 0),helperRec(cost,1));
       

        //2.Recursion from top to 0 , 
       // return Math.min(helperRec(cost, n-1),helperRec(cost,n-2));

       //3.Recursion + Memoization = top down DP
      // int n = cost.length;
       //int[] dp = new int[n+1];
       //.fill(dp, -1);
       //return Math.min(helperRec(cost, n-1, dp), helperRec(cost, n-2,dp));

       //4.Tabulation = Bottom up DP
       int n = cost.length;
       int[] dp = new int[n+1];
//Arrays.fill(dp, -1);
       dp[0] = cost[0];
       dp[1] = cost[1];

       for(int i=2; i<n; i++){
        dp[i] = cost[i] + Math.min(dp[i-1],dp[i-2]);
       }
        dp[n] = Math.min(dp[n-1], dp[n-2]);
        return dp[n];
        

       //5.Space optimization



    }

    }

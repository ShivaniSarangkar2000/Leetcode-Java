class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0; i<n-3; i++){
            //skip duplicate values for first fixed number
            if(i>0 && nums[i] == nums[i-1]) continue;

            //min sum too big , no later i can work
            if((long) nums[i] + nums[i+1] + nums[i+2] + nums[i+3] > target) break;
            //max sum too small, try for next iteration i, skip this iteration
            if((long) nums[i] + nums[n-3] + nums[n-2] + nums[n-1] < target) continue;

            //j loop inside i
            for(int j=i+1; j<n-2; j++){
                //skip duplicate values for first fixed number
                if(j>i+1  && nums[j] == nums[j-1]) continue;

               // Same pruning checks, now with i and j fixed
            if((long) nums[i] + nums[j] + nums[j+1] + nums[j+2] > target) break;
            
            if((long) nums[i] + nums[j] + nums[n-2] + nums[n-1] < target) continue;

            // // Two pointers find the remaining two numbers
                int l = j + 1, r = n - 1;
                while (l < r) {
                    // Cast to long so the sum cannot overflow int
                    long sum = (long) nums[i] + nums[j] + nums[l] + nums[r];

                    if (sum == target) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                        l++;
                        r--;
                        // Skip duplicates for the third and fourth numbers
                        while (l < r && nums[l] == nums[l - 1]) l++;
                        while (l < r && nums[r] == nums[r + 1]) r--;
                    } else if (sum < target) {
                        l++;   // need a bigger sum
                    } else {
                        r--;   // need a smaller sum
                    }//else


                }//while loop

            }//j for loop , inner

        }//for outer, i

        return res;
        
    }
}
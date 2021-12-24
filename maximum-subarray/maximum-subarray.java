class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int ans = Integer.MIN_VALUE;
        int curr = 0;
        for(int i=0;i<n;i++){
             curr+=nums[i];
             ans = Math.max(ans,curr);
             if(curr<0){curr=0;}
        }
        return ans;
    }
}
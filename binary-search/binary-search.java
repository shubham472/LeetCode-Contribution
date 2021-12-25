class Solution {
    public int search(int[] nums, int target) {
        int ans = -1;
        int s=0,e=nums.length-1;
        if(target<nums[s] || target>nums[e]){
          return ans;
        }
        while(s<=e){
            int m = s+(e-s)/2;
            if(nums[s]==target){
                return s;
            }
            if(nums[m]==target){
                return m;
            }
           if(nums[m]<target){
               s=m+1;
           }else{
                e=m-1;
            }
        }
        return ans;
    }
}
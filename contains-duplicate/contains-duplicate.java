class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        if(n==1){ return false;}
        Arrays.sort(nums);
        for(int i=1;i<n;i++){
            if(nums[i-1]==nums[i]){
                return true;
            }
        }
        return false;
        
    }
}
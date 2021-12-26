class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int s=0,e=n-1,k=n-1;
        while(s<=e){
            if(nums[s]<0){
                int sn = nums[s]*nums[s];
                int sm = nums[e]*nums[e];
                if(sn>sm){
                    ans[k] = sn;
                    k--;
                    s++;
                }else{
                    ans[k] = nums[e]*nums[e];
                    k--;
                    e--;
                }
            }else{
                ans[k] = nums[e]*nums[e];
                k--;
                e--;
            }
        } 
        return ans;
    }
}
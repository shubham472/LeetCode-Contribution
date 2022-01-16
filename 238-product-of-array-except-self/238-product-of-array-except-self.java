class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int c=0,nonzero=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                c++;
            }else{
               prod*=nums[i]; 
            }   
        }
        nonzero = prod;
        if(c>0){prod = 0; }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0){
                nums[j] = prod/nums[j];
            }else{
                if(c>1){
                    nums[j] = 0;
                }else{
                    nums[j] = nonzero;
                }
            }
        }
        return nums;
    }
}
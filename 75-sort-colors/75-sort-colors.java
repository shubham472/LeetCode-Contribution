class Solution {
    public void sortColors(int[] nums) {
        int i=0,j=0,k=0;
        for(int p=0;p<nums.length;p++){
            if(nums[p]==0){i++;}
            else if(nums[p]==1){j++;}
            else{k++;}
        }
        int q=0;
        while(i>0){
            nums[q] = 0;
            i--;
            q++;
        }
        while(j>0){
            nums[q] = 1;
            j--;
            q++;
        }
        while(k>0){
            nums[q] = 2;
            k--;
            q++;
        }
    }
}
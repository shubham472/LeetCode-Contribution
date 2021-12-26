class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n];
        k=k%n;
        int i=0;
        while(k<n){
            ans[k] = nums[i];
            k++;
            i++;
        }
        int j=0;
        while(i<n){
            ans[j] = nums[i];
            i++;
            j++;
        }
        for(int p=0;p<n;p++){
            nums[p] = ans[p];
        }
        
    }
}
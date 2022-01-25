class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(!map.contains(nums[i])){
                map.add(nums[i]);
                nums[j] = nums[i];
                j++;
            }
        }
        return map.size();
    }
}
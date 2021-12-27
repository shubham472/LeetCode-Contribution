class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            if(map.containsKey(numbers[i])){
                ans[0] = map.get(numbers[i]);
                ans[1] = i+1;
                break;
            }else{
                if(!map.containsKey(target-numbers[i])){
                    map.put(target-numbers[i],i+1);
                }
            }
        }
        return ans;
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] chArr = s.toCharArray();
        int maxLen = 0;
        for(int i=0;i<chArr.length;i++){
            int curr = 0;
            HashSet<Character> hs = new HashSet<>();
            for(int j=i;j<chArr.length;j++){
                char c = chArr[j];
                if(hs.contains(c)){
                    break;
                }else{
                    hs.add(c);
                    curr++;
                }
                maxLen = Math.max(curr,maxLen);
            }
        }
        return maxLen;
    }
}
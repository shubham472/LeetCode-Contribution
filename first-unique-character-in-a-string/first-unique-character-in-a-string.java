class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        HashSet<Character> dup = new HashSet<>();
        char[] chArr = s.toCharArray();
        for(int i=0;i<chArr.length;i++){
            char c = chArr[i];
            if(map.containsKey(c)){
                map.remove(c);
                dup.add(c);
            }else{
                if(!dup.contains(c)){
                    map.put(c,i);
                }
            }
        }
        int ans = Integer.MAX_VALUE;
        for(Map.Entry<Character,Integer>entry:map.entrySet()){
            ans = Math.min(ans,entry.getValue());
        }
        if(ans == Integer.MAX_VALUE){
            return -1;
        }else{
            return ans;
        }
    }
}
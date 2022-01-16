class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                int x = map.get(c);
                map.put(c,x+1);
            }else{
                map.put(c,1);
            }
        }
        int c=0;
        int max = 0;
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            if(entry.getValue()%2==0){
                max+=entry.getValue();
            }else{
                if(c==0){
                    max+=entry.getValue();
                    c=1;
                }else{
                    max+=entry.getValue()-1;
                }
            }
        }
        return max;  
    }
}
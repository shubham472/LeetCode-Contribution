class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        char[] chArr = s.toCharArray();
        for(int i=0;i<chArr.length;i++){
            char c = chArr[i];
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        char[] ranArr = t.toCharArray();
        for(int i=0;i<ranArr.length;i++){
            char ch = ranArr[i];
            if(map.containsKey(ch)){
                int f = map.get(ch);
                if(f>1){
                     map.put(ch,f-1);
                }else{
                    map.remove(ch);
                }
            }else{
                return false;
            }
        }
        if(map.size()==0){
            return true;
        }else{
            return false;
        }
    }
}
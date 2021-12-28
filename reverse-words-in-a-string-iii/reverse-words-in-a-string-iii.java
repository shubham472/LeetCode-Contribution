class Solution {
    public String reverseWords(String s) {
        String ans = "";
        String[] str = s.split(" ");
        int i=0,l=str.length;
        while(i<l){
            String t = str[i];
            int j=0,k=t.length()-1;
            while(k>-1){
                ans+=t.substring(k,k+1);
                k--;
            }
            if(i!=l-1){
                ans+=" ";
            }
            i++;
        }
        return ans;
    }
}
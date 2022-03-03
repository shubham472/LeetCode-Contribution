class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length(),m=needle.length();
        if(m==0){return 0;}
        if(n==0 || m>n){
            return -1;
        }
        int r=n-m;
        for(int i=0;i<=r;i++){
            if(haystack.substring(i,i+m).equals(needle)){
                return i;
            }
        }
       return -1;
    }
}
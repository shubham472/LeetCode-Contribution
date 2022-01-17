class Solution {
    public boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        while(i<j){
            char st = s.charAt(i);
            char ed = s.charAt(j);
            if(!Character.isLetter(st) && !Character.isDigit(st)){
                i++;
                continue;
            }else if(!Character.isLetter(ed) && !Character.isDigit(ed)){
                j--;
                continue;
            }else if(Character.toLowerCase(st)!=Character.toLowerCase(ed)){
                return false;
            }
            i++;
            j--;
        }
        return true;
        
    }
}
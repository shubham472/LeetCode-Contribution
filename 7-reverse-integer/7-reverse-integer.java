class Solution {
    public int reverse(int x) {
        int c=0;
        if(x<0){
            x*=-1;
            c=1;
        }
        int y=0,b=1;
        while(x>0){
             if (Integer.MAX_VALUE /10 < y || (Integer.MAX_VALUE - x % 10) < y*10) {
                return 0;
            }
            y=y*10+(x%10);
            x/=10;
        }
        if(c==0){
            return y;
        }else{
            return -1*y;
        }
        
    }
}
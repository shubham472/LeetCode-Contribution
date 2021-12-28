class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> hset = new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char num = board[i][j];
                if(num!='.'){
                     if(!hset.add(num+"r"+i) || !hset.add(num+"c"+j) || !hset.add(num+"b"+i/3+"-"+j/3)){
                         return false;
                     }
                }
            }
        }
        return true;
        
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        //int[][] result = new int[mat.length][mat[0].length];
        int m = mat.length,n=mat[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    continue;
                }else{
                    int left = m*n;
                    int top = m*n;
                    if(i>0){
                         left = mat[i-1][j];
                    }
                    if(j>0){
                         top = mat[i][j-1];
                    }
                    mat[i][j] = 1+Math.min(left,top);
                }
            }
        }
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(mat[i][j]==0){
                    continue;
                }else{
                    int right = m*n;
                    int bottom = m*n;
                    if(i<m-1){
                         right = mat[i+1][j];
                    }
                    if(j<n-1){
                         bottom = mat[i][j+1];
                    }
                    mat[i][j] = Math.min(mat[i][j],1+Math.min(right,bottom));
                }
            }
        }
        return mat;
    }
}
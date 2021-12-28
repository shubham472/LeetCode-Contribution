class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int k=0;
        while(k<m){
            if(matrix[k][0]>target){
                break;
            }
            k++;
        }
        if(k>0){k--;};
        for(int i=0;i<n;i++){
            if(matrix[k][i]==target){
                return true;
            }
        }
        return false;
    }
}
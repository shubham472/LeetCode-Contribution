class Solution {
    public int[][] merge(int[][] intervals) {
         Arrays.sort(intervals, (o1,o2)->o1[0]-o2[0]);
        int m = intervals.length,n= intervals[0].length;
        int j=0;
        for(int i=1;i<m;i++){
            int px = intervals[j][0];
            int py = intervals[j][1];
            int cx = intervals[i][0];
            int cy = intervals[i][1];
            if(py>=cx){
                if(py>cy){
                  intervals[j][1] = py;
                }else{
                    intervals[j][1] = cy; 
                }
                if(px>cx){
                    intervals[j][0] = cx;
                }
            }else{
                j++;
                intervals[j][0] = cx;
                intervals[j][1] = cy;
            }
        }
        int[][] ans = new int[j+1][2];
        for(int k=0;k<j+1;k++){
            ans[k][0] = intervals[k][0];
            ans[k][1] = intervals[k][1];
        }
        return ans;
    }
}
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        if(numRows>0){
            List<Integer> l= new ArrayList<>();
            l.add(1);
            ans.add(l);
        }
        int k=1;
        while(k<numRows){
            List<Integer> m = new ArrayList<>();
            if(k==1){
                m.add(1);
                m.add(1);
            }else{
                m.add(1);
                List<Integer> prevList = ans.get(k-1);
                for(int i=1;i<prevList.size();i++){
                    m.add(prevList.get(i)+prevList.get(i-1));
                }
                m.add(1);
            }
            ans.add(m);
            k++;
        }
        return ans;
    }
}
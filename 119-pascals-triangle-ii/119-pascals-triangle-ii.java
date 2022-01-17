class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prev = new ArrayList<>();
        prev.add(1);
        for(int i=0;i<rowIndex;i++){
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for(int j=1;j<prev.size();j++){
                //System.out.println("j "+j+" "+prev.get(j));
                curr.add(prev.get(j-1)+prev.get(j));
            }
            curr.add(1);
            prev = new ArrayList<Integer>(curr);
        }
        return prev;
    }
}
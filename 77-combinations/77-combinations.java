class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        count(n,k,1,result,temp);
        return result;
    }
    
    public static void count(int n, int k, int index, List<List<Integer>> result, List<Integer>temp) {
        if(k==0){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i=index;i<=n;i++){
            temp.add(i); 
            count(n,k-1,i+1,result,temp);
            temp.remove(temp.size()-1); 
        }
    }
}
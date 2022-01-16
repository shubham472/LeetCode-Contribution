class MyHashMap {
    ArrayList<ArrayList<Integer>> map = new ArrayList<>();
    public MyHashMap() {
        
    }
    
    public void put(int key, int value) {
        if(get(key)==-1){
           ArrayList<Integer> temp = new ArrayList<>();
           temp.add(key);
           temp.add(value);
           map.add(new ArrayList<Integer>(temp));
        }else{
            for(int i=0;i<map.size();i++){
                ArrayList<Integer> tp = map.get(i);
                if(tp.get(0)==key){
                    map.get(i).set(1,value);
                }
            }
        }
    }
    
    public int get(int key) {
        for(int i=0;i<map.size();i++){
            ArrayList<Integer> tp = map.get(i);
            if(tp.get(0)==key){
              return map.get(i).get(1);
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        for(int i=0;i<map.size();i++){
            ArrayList<Integer> tp = map.get(i);
            if(tp.get(0)==key){
              map.remove(i);
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
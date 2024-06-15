class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        generate(result, new ArrayList<>(), n, k, 1 );
        return result;
    }
    
    public void generate(List<List<Integer>> result, List<Integer> temp, int n, int k, int index){
        if(temp.size()==k){
            result.add(new ArrayList<>(temp));
            return;
        }
        
        for(int i=index; i<=n; i++){
            
            temp.add(i);
            generate(result, temp, n, k, i+1);
            temp.remove(temp.size()-1);
            
        }
        
        
    }
}
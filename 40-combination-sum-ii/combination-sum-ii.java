class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, result, new ArrayList<>(), target, 0);
        return result;
    }
    
    private void backtrack(int[] candidates, List<List<Integer>> result, ArrayList<Integer> temp, int target, int index){
        if(target==0){
            result.add(new ArrayList<>(temp));
            return;
        }
      
        
        for(int i=index; i<candidates.length; i++){
            if(i>index && candidates[i]==candidates[i-1])continue;
            if(candidates[index]>target || target<0)return;
        
            temp.add(candidates[i]);
            backtrack(candidates, result, temp, target-candidates[i],i+1);
            temp.remove(temp.size()-1);
        }        
    }
}
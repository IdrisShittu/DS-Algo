class Solution {
    
    
    public void combinations(int ind, int[] candidates, int target, List<List<Integer>> result, List<Integer> ans){
        if(ind==candidates.length){
            if(target==0){
                result.add(new ArrayList<>(ans));
            }
            return;
        }
        if(candidates[ind]<=target){
            ans.add(candidates[ind]);
            combinations(ind, candidates, target-candidates[ind], result, ans);
            ans.remove(ans.size()-1); 
        }
        combinations(ind+1, candidates, target, result, ans);
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        combinations(0, candidates, target, result, new ArrayList<>());
        System.out.println(result);
        return result;
    }
}
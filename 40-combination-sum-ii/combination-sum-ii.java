class Solution {
    
   public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); // Sort the array to handle duplicates and facilitate backtracking
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] candidates, int remain, int start) {
        if (remain == 0) {
            result.add(new ArrayList<>(tempList)); // Valid combination found
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) continue; // Skip duplicates
            if (candidates[i] > remain) break; // No need to proceed if the current candidate exceeds the remaining sum

            tempList.add(candidates[i]);
            backtrack(result, tempList, candidates, remain - candidates[i], i + 1); // Recurse with reduced target
            tempList.remove(tempList.size() - 1); // Backtrack
        }
    }
    
}
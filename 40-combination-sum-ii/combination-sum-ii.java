class Solution {
    
   public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); // Sort the array to handle duplicates and facilitate backtracking
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] candidates, int remain, int start) {
        if (remain < 0) return; // If remaining sum is negative, no valid solution
        if (remain == 0) {
            result.add(new ArrayList<>(tempList)); // Valid combination found
            return;
        }
        if (start >= candidates.length) return; // Beyond the end of the array

        // Include the current candidate
        tempList.add(candidates[start]);
        backtrack(result, tempList, candidates, remain - candidates[start], start + 1);

        // Exclude the current candidate and handle duplicates
        tempList.remove(tempList.size() - 1);
        while (start + 1 < candidates.length && candidates[start] == candidates[start + 1]) {
            start++; // Skip duplicates
        }
        backtrack(result, tempList, candidates, remain, start + 1);
    }
    
}
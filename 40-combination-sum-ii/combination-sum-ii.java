class Solution {
    
   public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); // Sort the array to handle duplicates and facilitate backtracking
        backtrack(result, new ArrayList<>(), candidates, target, 0, false);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] candidates, int remain, int start, boolean included) {
        if (remain < 0) return; // If remaining sum is negative, no valid solution
        if (remain == 0) {
            result.add(new ArrayList<>(tempList)); // Valid combination found
            return;
        }
        if (start >= candidates.length) return; // Beyond the end of the array

        // Skip the current start index if not included and it's the same as the previous
        if (start > 0 && candidates[start] == candidates[start - 1] && !included) {
            backtrack(result, tempList, candidates, remain, start + 1, false);
        } else {
            // Include the current candidate
            tempList.add(candidates[start]);
            backtrack(result, tempList, candidates, remain - candidates[start], start + 1, true);

            // Exclude the current candidate
            tempList.remove(tempList.size() - 1);
            backtrack(result, tempList, candidates, remain, start + 1, false);
        }
    }
    
}
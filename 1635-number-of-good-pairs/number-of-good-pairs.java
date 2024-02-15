class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        int res = 0;
        for (int i : mp.values()) {
            res += i * (i - 1) / 2;
        }
        return res; 
    }
}
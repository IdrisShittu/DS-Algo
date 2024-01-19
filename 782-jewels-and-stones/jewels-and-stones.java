class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int result = stones.length() - stones.replaceAll("[" + jewels + "]", "").length();
        return result;
    }
}
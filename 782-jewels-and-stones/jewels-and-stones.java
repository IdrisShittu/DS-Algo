class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jw = new HashSet<>();
        int count=0;
        for(int i=0; i<jewels.length(); i++) jw.add(jewels.charAt(i));
        for(int i=0; i<stones.length(); i++) if(jw.contains(stones.charAt(i)))count++;
        return count;
    }
}
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> allow = new HashSet<>();
        int result=0;
        for(char ch : allowed.toCharArray())allow.add(ch);

        for(String s: words){
            result++;
            for(char c: s.toCharArray()){
                if(!allow.contains(c)){
                    result--;
                    break;
                }
            }
        }
        return result;
    }
}
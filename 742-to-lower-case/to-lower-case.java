class Solution {
    public String toLowerCase(String s) {
        Map<Character, Character> ch = new HashMap<>();
        for(char c='A'; c<='Z'; c++){
            ch.put(c,Character.toLowerCase(c));
        }
        StringBuilder str = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(ch.containsKey(s.charAt(i)))str.append(ch.get(s.charAt(i))); 
            else str.append(s.charAt(i));
        }
        return str.toString();
    }
}
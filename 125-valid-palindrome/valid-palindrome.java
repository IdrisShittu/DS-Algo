class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        Stack<Character> ch = new Stack<>();
        for(int i=0;i<s.length();i++)ch.push(s.charAt(i));
        for(int i=0; i<s.length(); i++)
            if(s.charAt(i)!=ch.pop())return false;
        return true;      
    }
}
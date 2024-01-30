class Solution {
    public void reverseString(char[] s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(char c: s)stack.push(c);
        for(int i=0; i<s.length;i++)s[i]=stack.pop();
    }
}
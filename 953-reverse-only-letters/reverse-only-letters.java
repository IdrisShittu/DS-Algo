class Solution {
    public String reverseOnlyLetters(String s) {
        Stack<Character> ch = new Stack<>();
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++)
            if(Character.isLetter(s.charAt(i)))ch.push(s.charAt(i));
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i)))str.append(ch.pop());
            else str.append(s.charAt(i));  
        }
        return str.toString();
    }
}
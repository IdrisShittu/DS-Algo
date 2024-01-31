class Solution {
    public String reverseVowels(String s) {
        StringBuilder str = new StringBuilder(s);
        Stack<Character> stck = new Stack<>();

        for(int i=0;i<str.length();i++)
            if(isVowel(str.charAt(i)))stck.push(str.charAt(i));

        for(int i=0;i<str.length();i++)
            if(isVowel(str.charAt(i)))str.setCharAt(i,stck.pop());
        
      
        return str.toString();
    }

    public boolean isVowel(char ch){
        ch=Character.toLowerCase(ch);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')return true;
        else return false;
    }
}
class Solution {
    public char findTheDifference(String s, String t) {
        int[] str = new int[26];
        for(int i=0;i<t.length();i++)str[t.charAt(i)-'a']++;
        for(int i=0;i<s.length();i++)str[s.charAt(i)-'a']--;
        for(int i=0;i<str.length;i++)if(str[i]>0)return (char)(i+97);
        return '-';
    }
}
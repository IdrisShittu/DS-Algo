class Solution {
    public void reverseString(char[] s) {
        StringBuilder str = new StringBuilder(String.valueOf(s));
        str = str.reverse();
        System.out.println(str);
        str.getChars(0,str.length(),s,0);
    }
}
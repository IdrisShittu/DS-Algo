class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.equals(word.toUpperCase())) return true;
        if (word.equals(word.toLowerCase())) return true;

        StringBuilder sb = new StringBuilder(word.toLowerCase());
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        if (word.equals(sb.toString())) return true;
        return false; 
    }
}
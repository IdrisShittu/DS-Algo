import java.util.regex.*;
class Solution {
    public int lengthOfLastWord(String s) {
        Matcher matcher = Pattern.compile("(\\S+)\\s*$").matcher(s);
        if (matcher.find()) return matcher.group(1).length();
        return -1;
    }
}
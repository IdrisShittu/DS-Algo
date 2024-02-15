import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public int countSegments(String s) {
    
        Matcher matcher = Pattern.compile("\\S+").matcher(s);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        return count;
    }
}
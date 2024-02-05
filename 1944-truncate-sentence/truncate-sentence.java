import java.util.regex.*;
class Solution {
    public String truncateSentence(String s, int k) {
        Pattern pattern = Pattern.compile(String.format("(\\b\\w+\\s){%d}(\\b\\w+)", k - 1));
        Matcher matcher = pattern.matcher(s);
     
        if (matcher.find()) {
            return matcher.group(0); 
        } else {
            return s; 
        }
    }
}

       
  
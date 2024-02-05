import java.util.regex.*;
class Solution {
    public String truncateSentence(String s, int k) {

       StringBuilder result = new StringBuilder();
       String[] str=s.split(" ");
       for(int i=0;i<k;i++){
           result.append(str[i]);
           if(i!=k-1)result.append(" ");
       }
       return result.toString();
    }
}

       
  
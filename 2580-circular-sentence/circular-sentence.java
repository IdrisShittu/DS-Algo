class Solution {
    public boolean isCircularSentence(String sentence) {
         String[] str = sentence.split(" ");
         if(str.length==1){
             if(sentence.charAt(0)==sentence.charAt(sentence.length()-1))return true;
         }
         if(str[str.length-1].charAt(str[str.length-1].length()-1)!=str[0].charAt(0))return false;
         for(int i=0; i<str.length-1; i++){
             if(str[i].charAt(str[i].length()-1)!=str[i+1].charAt(0))return false;
         }
         return true;
    }
}
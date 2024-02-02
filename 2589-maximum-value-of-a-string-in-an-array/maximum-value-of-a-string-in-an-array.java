class Solution {
    public int maximumValue(String[] strs) {
       int max=0;
       boolean areAllDigits=true;
       for(String s : strs){
         for(int i=0;i<s.length();i++){
             if(!Character.isDigit(s.charAt(i))){
                 areAllDigits=false;
                 break; 
             }
         }  
         max = (areAllDigits)?Math.max(max,Integer.parseInt(s)):Math.max(max,s.length());
         areAllDigits=true;
       } 
       return max;
    }
}
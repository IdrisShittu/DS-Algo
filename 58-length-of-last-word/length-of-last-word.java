class Solution {
    public int lengthOfLastWord(String s) {
        int len=0; Boolean letterNotSeen=true;
        for(int i=s.length()-1;i>=0;i--){
            if(letterNotSeen && Character.isLetter(s.charAt(i)))letterNotSeen=false;
            if(!letterNotSeen && Character.isLetter(s.charAt(i)))len++;
            if(!letterNotSeen && !Character.isLetter(s.charAt(i)))break;  
         }
        return len;
    }
}
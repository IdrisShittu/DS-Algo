class Solution {
    public String reverseOnlyLetters(String s) {
        int i=0, j=s.length()-1;
        char temp;
        StringBuilder str = new StringBuilder(s);
        while(i<j){
            if(!Character.isLetter(s.charAt(i)))i++;
            if(!Character.isLetter(s.charAt(j)))j--;   
            if(Character.isLetter(s.charAt(i)) && Character.isLetter(s.charAt(j))){
                temp = s.charAt(i);
                str.setCharAt(i,str.charAt(j));
                str.setCharAt(j,temp);
                i++;
                j--;
            }            
        }
        return str.toString();
    }
}
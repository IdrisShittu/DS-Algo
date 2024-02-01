class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        StringBuilder strReverse = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                str.append(Character.toLowerCase(s.charAt(i)));
                strReverse.insert(0,Character.toLowerCase(s.charAt(i)));
            }
        }
        System.out.println(str+" ");
        System.out.println(strReverse);

        return str.compareTo(strReverse)==0;
        
    }
}
class Solution {
    public String reverseVowels(String s) {
        int i=0,j=s.length()-1;
        StringBuilder str = new StringBuilder(s);
        char temp;
        while(i<j){
            if(isVowel(str.charAt(i)) && isVowel(str.charAt(j)) ){
                temp=str.charAt(i);
                str.setCharAt(i++,str.charAt(j));
                str.setCharAt(j--,temp);
            }
            System.out.println(i+" "+str.charAt(i));
            if(!isVowel(str.charAt(i)))i++;
            if(!isVowel(str.charAt(j)))j--;
            
        }
      
        return str.toString();
    }

    public boolean isVowel(char ch){
        ch=Character.toLowerCase(ch);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')return true;
        else return false;
    }
}
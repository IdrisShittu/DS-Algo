class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        
        String str[] =sentence.split(" "); 
        for(int i=0; i<str.length;i++){
            for(int j=0; j<searchWord.length(); j++){
                if(str[i].length()<searchWord.length())break;
                if(str[i].charAt(j)!=searchWord.charAt(j)){
                    break;
                }
                if(j==searchWord.length()-1){
                    return i+1;
                }
            }
           
        }
        
        return -1;
    }
}
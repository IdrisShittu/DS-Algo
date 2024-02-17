class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] ch = new int[26];
        for(char c: sentence.toCharArray()){
            ch[c-'a']++;
        }
        for(int c: ch){
            if(c==0)return false;
        }

        return true;
        
    }
}
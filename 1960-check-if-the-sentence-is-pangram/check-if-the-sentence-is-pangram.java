class Solution {
    public boolean checkIfPangram(String sentence) {
        for(char c='a'; c<='z'; c++){
            if(sentence.indexOf(c)<0)return false;
        }
        return true;
    }
}
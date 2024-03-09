class Solution {
    public int percentageLetter(String s, char letter) {
       return getPercentage(s,letter); 
    }

    public int getPercentage(String s, char letter){
        int[] mp = new int[26];
        for(char ch : s.toCharArray()){
            mp[ch-'a']+=1;
        }
        return (mp[letter-'a']*100)/s.length();
    }
}
class Solution {
    public boolean isFascinating(int n) {
        int[] freq = new int[10];
        StringBuilder str = new StringBuilder(Integer.toString(n));
        str.append(Integer.toString(2*n));
        str.append(Integer.toString(3*n));

        String s= str.toString();
        for(char ch : s.toCharArray()){
            freq[ch-48]++;
        }

        for(int i=1;i<freq.length;i++){
            if(freq[i]!=1)return false;
        }

        return true;
        
    }
}
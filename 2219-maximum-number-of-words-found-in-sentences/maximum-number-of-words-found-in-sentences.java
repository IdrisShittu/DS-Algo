class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0, count=1;
        for(String s: sentences){
            for(int i=0;i<s.length();i++)
                if(s.charAt(i)==' ')count++;
            max=Math.max(max,count);
            count=1;
        }
        return max;
    }
}
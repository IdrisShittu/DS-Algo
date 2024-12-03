class Solution {
    public String addSpaces(String s, int[] spaces) {
        int len=0,count=0;
        StringBuilder buffer = new StringBuilder(s);
      
        for(int i=0; i<spaces.length;i++ ){
            buffer.insert(spaces[i]+count," ");
            count++;
        }
        return buffer.toString();
        
    }
}
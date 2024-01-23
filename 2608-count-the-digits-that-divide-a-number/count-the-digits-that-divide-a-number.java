class Solution {
    public int countDigits(int num) {
        String val = num+"";
        int count =0;
        for(int i=0; i<val.length(); i++){

      
            if(num%(val.charAt(i)-'0')==0)count++;
        }
        return count;
    }
}
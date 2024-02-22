class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count=0;
        for(char i : s.toCharArray()){
            if(i=='1')count++;
        }

        StringBuilder str = new StringBuilder("1".repeat(count-1));
        str.append("0".repeat(s.length()-count));
        str.append(1);

        return str.toString();
        
    }
}
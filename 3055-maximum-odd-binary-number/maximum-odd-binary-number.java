class Solution {
    public String maximumOddBinaryNumber(String s) {
        String res= s.replaceAll("0","");
        return res.replaceAll("1$",s.replaceAll("1","")+"1");
    }
}
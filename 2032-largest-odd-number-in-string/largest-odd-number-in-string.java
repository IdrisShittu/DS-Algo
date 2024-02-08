class Solution {
    public String largestOddNumber(String num) {
        return num.replaceAll("[02468]+$","");
    }
}
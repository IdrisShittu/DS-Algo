class Solution {
    public String removeTrailingZeros(String num) {
        StringBuilder result = new StringBuilder();
        int i,j;
        for(j=num.length()-1;j>=0;j--)if(num.charAt(j)!='0')break;
        for(i=0;i<=j;i++)if(num.charAt(j)!='0')result.append(num.charAt(i));
        return result.toString();     
    }
}
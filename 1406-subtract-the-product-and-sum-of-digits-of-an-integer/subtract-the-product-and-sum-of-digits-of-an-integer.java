class Solution {
    public int subtractProductAndSum(int n) {
        int product=1, sum=0, j=1;
        String num = Integer.toString(n);
        for(int i=0; i<num.length();i++){
           j = Character.getNumericValue(num.charAt(i));
           product*=j;
           sum+=j;
        }
        return product-sum;   
    }
}
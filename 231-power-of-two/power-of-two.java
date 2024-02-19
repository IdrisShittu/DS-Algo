class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==536870912)return true;
        Double res=(Math.log(n)/Math.log(2));
        return n>0 && res%1 == 0;
    }
}
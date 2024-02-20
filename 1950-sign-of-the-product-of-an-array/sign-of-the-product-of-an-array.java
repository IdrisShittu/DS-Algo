class Solution {
    public int arraySign(int[] nums) {
        double product=1;
        for(int num: nums)product*=num;
        if(product == 0 || Double.isNaN(product))return 0;
        return (product>0)?1:-1;
    }
}
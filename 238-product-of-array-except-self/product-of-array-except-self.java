class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int product =1;
        int[] pre = new int[len];
        int[] post = new int[len];
        int[] result = new int[len];
        pre[0]=1;
        post[len-1]=1;

        for(int i=1; i<len; i++){
            product= nums[i-1]*product;
            pre[i]=product;
        }
        product=1;
        for(int i=len-2; i>=0; i--){
            product= nums[i+1]*product;
            post[i]=product;
        }

        for(int i=0; i<len; i++){
            result[i]=pre[i]*post[i];
        }
        return result;
    }
}
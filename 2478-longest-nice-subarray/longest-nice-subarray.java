class Solution {
    public int longestNiceSubarray(int[] nums) {
        int start=0, end=1, count=1,maxCount=-1, res=1;
        if(nums.length==1)return 1;
        res=nums[start];
        while(end<nums.length){
            if((res & nums[end])==0){
                res = res | nums[end];
                count++;
                end++;
            }else{
                res= res ^ nums[start];
                count--;
                if(start==end){
                    start++; 
                    end++;
                }
                else start++;
            }
            maxCount=Math.max(count,maxCount);
        }
        
        return maxCount;
    }
}
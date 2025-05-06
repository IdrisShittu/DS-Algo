class Solution {
    public int[] buildArray(int[] nums) {
        int i=0;
        int ans[] = new int[nums.length];
        for(int num: nums){
            ans[i++]=nums[num];
        }
        return ans;
        
    }
}
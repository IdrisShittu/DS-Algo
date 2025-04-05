class Solution {
    public int subsetXORSum(int[] nums) {
       return XORRecurse(nums,0,0);
    }

    public int XORRecurse(int[] nums, int index, int total){
        if(index==nums.length)return total;
        return XORRecurse(nums, index+1, total^nums[index]) + XORRecurse(nums, index+1, total);

    }
}
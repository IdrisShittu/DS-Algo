/*Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.

Example:

Input: nums = [1,2,4,2,2]
Output: 2

*/



class Solution {
    public int findDuplicate(int[] nums) {
        int slow=nums[0];
        int fast=nums[0];
        
        while(true){
            slow=nums[slow];
            fast=nums[nums[fast]];
            if(slow==fast)break;
        }
        
        int slow2=nums[0];
        while(true){
            if(slow==slow2)break;
            slow=nums[slow];
            slow2=nums[slow2];
            
        }
        
        return slow;
    }
}

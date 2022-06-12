/*Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

Example 1:

Input: nums = [3,2,3]
Output: [3]

- Modified Boyer Moore Algo
*/

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int num1=Integer.MAX_VALUE, num2=Integer.MIN_VALUE, count1=0, count2=0;
        for(int num: nums){
            if(num==num1)count1++;
            else if(num==num2)count2++;
            else if(count1==0){
                count1++;
                num1=num;
            }else if(count2==0){
                count2++;
                num2=num;
            }
            else{
                count1--;
                count2--;   
            }
        }    
        count1=0; count2=0;
        for(int num : nums){
            if(num==num1)count1++;
        }
        for(int num : nums){
            if(num==num2)count2++;
        }
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(count1>nums.length/3)result.add(num1);
        if(count2>nums.length/3)result.add(num2);
        
        return result;        
    }
}

class Solution {
    public long findTheArrayConcVal(int[] nums) {
       int i=0, j=nums.length-1;
       long sum=0;
       while(i<=j){
        if(i==j){
         sum+=nums[i];
         break;
        }
        sum+= Integer.parseInt(Integer.toString(nums[i++])+Integer.toString(nums[j--]));
       }
       return sum;
    }
}
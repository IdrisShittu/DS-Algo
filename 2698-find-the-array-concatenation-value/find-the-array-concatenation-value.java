class Solution {
    public long findTheArrayConcVal(int[] nums) {
       int i=0, j=nums.length-1;
       long sum=0;
       while(i<=j){
        if(i==j){
         sum+=nums[i];
         break;
        }
        sum+= nums[i]*Math.pow(10,(int)Math.log10(nums[j])+1)+nums[j];
        i++;j--;
       }
       return sum;
    }
}
class Solution {
    public int countKDifference(int[] nums, int k) {
        //remark:use foreach to simplify the implementation
        int[] arr = new int[101]; int res=0;
        for(int i=0; i<nums.length; i++){
             if(nums[i]-k>-1 ){
                  res+=(arr[nums[i]-k]!=0)?arr[nums[i]-k]:0;
             }
              if( nums[i]+k<arr.length ){
                 res+= (arr[nums[i]+k]!=0)?arr[nums[i]+k]:0;
              }
              arr[nums[i ]]++;
        }
        return res;
    }
}
class Solution {
    public int[] sortArrayByParity(int[] nums) {

        int evenPointer=0, oddPointer=nums.length-1;
        
        int[] res = new int[nums.length];

        for(int arr:nums){
            if(arr%2==0){
                res[evenPointer++]=arr;
            }else{
                res[oddPointer--]=arr;
            }
        }

        return res;
    }
}
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        int[] arr= new int[101];
        for(int num: nums){
            int i=(arr[num]!=0)?arr[num]:0;
            count+=i;
            arr[num]++;  
        } 
        return count;   
    }
}
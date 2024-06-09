class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        
        HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
        int sum=0;
        mp.put(0,-1);
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
           
            if(mp.containsKey(sum%k)){
                 if(i-mp.get(sum%k)>1)return true;
            }
            else{ 
                mp.put(sum%k,i);
            }
        }
        return false;
        
    }
}
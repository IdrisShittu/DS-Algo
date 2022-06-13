/*Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

 

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]

*/


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        
        List<List<Integer>> res = new ArrayList();
     
        Arrays.sort(nums);
        
        Set<List<Integer>> m = new HashSet<>();
        Set<Integer> n = new HashSet<>();
         
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1; j<nums.length;j++){
            if(n.contains(-(nums[i]+nums[j]))){
               
                ArrayList<Integer> r = new ArrayList<Integer>();
                r.add(nums[i]);
                r.add(nums[j]);
                r.add( -(nums[i]+nums[j]) );
                
             
                if(!m.contains(r)){
                    res.add(r);
                    m.add(r);
                }
                 
            }
       
        }
             n.add(nums[i]);
    }
        
    return res;
}
    
}
